package single;


public class Single {
	//把自己的实例作为自己的静态成员
	private static Single instance = null;
	//构造函数private
	private Single(){}
	public synchronized static Single getInstance(){
		if(instance==null)
			instance = new Single();
		return instance;
	}
}
class Single1{
	private static Single1 s = new Single1();
	private Single1(){}
	public static synchronized Single1 getIntance(){
		return s;
	}
	
}
