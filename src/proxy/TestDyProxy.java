package proxy;

public class TestDyProxy {
	public static void main(String[] args) {
		RealSubject subject = new RealSubject();
		Subject subjectProxy = DynaProxyFactory.getProxy(subject);
		subjectProxy.request();
		
		subjectProxy.update();
		
	}

}
