package cglib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBuilderFactory implements InvocationHandler{
	private Object obj;//目标对象
	public ProxyBuilderFactory(Object obj){
		this.obj = obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		/*String name = method.getName();
		if(name.startsWith("find")){
			method.invoke(obj, args);
		}*/
		System.out.println("..........");
		method.invoke(obj, args);
		System.out.println("....");
		return null;
	}
	public Object getProxy(){
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}

}
