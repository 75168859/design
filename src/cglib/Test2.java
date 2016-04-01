package cglib;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Cache{
	private HashMap<String, String> hm = new HashMap<String, String>();
	private ReentrantReadWriteLock rrw = new ReentrantReadWriteLock();
	public String getData(String key){
		rrw.readLock().lock();
	    String value = null;
		try{
			value = hm.get(key);
			if(value==null){
				rrw.readLock().unlock();
				rrw.writeLock().lock();
				try{
					if(value==null){
						value = "xxxx...";
						hm.put(key, value);
					}
				}finally{
					rrw.writeLock().unlock();
				}
			}
		}finally{
			rrw.readLock().unlock();
		}
		
		return value;
	}
}
