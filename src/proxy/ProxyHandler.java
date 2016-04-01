package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//代理处理器
public class ProxyHandler implements InvocationHandler{
    private Object target;//目标对象/被代理的对象
    public ProxyHandler(Object target){
    	this.target = target;
    }
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("方法前，日志处理、事务处理，日志记录等等....");
		method.invoke(target, args);
		System.out.println("方法后事务处理，日志记录等等....");
		return null;
	}

}
