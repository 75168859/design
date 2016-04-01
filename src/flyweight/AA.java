package flyweight;

public class AA {
	private static ThreadLocal<AA> tl = new ThreadLocal<AA>();
	private AA(){}
	public static AA getInstance(){
		AA a = tl.get();
		if(a==null){
			a = new AA();
			tl.set(a);
		}
		return a;
	}
}
