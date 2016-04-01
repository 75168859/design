package proxy;

public class ProxyFactory {
	public static Subject getProxy(Subject realSubject){
		return new ProxySubject(realSubject);
	}
}
