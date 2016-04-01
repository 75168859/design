package proxy;

import java.lang.reflect.Proxy;

public class DynaProxyFactory {
	public static Subject getProxy(Subject realSubject) {
		return (Subject) Proxy.newProxyInstance(realSubject.getClass()
				.getClassLoader(), realSubject.getClass().getInterfaces(),
				new ProxyHandler(realSubject));
	}
}
