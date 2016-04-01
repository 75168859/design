package proxy;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		Subject subject = ProxyFactory.getProxy(realSubject);
		subject.request();
	}

}
