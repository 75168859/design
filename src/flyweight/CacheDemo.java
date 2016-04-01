package flyweight;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CacheDemo {
	//¶ÁÐ´Ëø
	ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	private HashMap<String, String> hm = new HashMap<String, String>();
	public Object getData(String key){
		String value = null;
		rwl.readLock().lock();
		try{
			value = hm.get(key);
			if(value==null){
				rwl.readLock().unlock();
				rwl.writeLock().lock();
				try{
					if(value==null){
					value="xxxx";
					hm.put(key, value);
					}					
				}finally{
					rwl.writeLock().unlock();
					rwl.readLock().lock();
				}
			}
			
		}finally{
			rwl.readLock().unlock();
		}
		return value;
	}
}
