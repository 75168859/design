package cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	// Ҫ�����ԭʼ����
	private Object obj;
	public Object createProxy(Object target) {
		this.obj = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.obj.getClass());
		// ���ô���Ŀ��
		enhancer.setCallback(this);
		// ���ûص�
		enhancer.setClassLoader(target.getClass().getClassLoader());
		return enhancer.create();
	}

	/**
	 * �ڴ���ʵ���ϴ��������ò����ؽ��
	 */
	public Object intercept(Object proxy, Method method, Object[] params,
			MethodProxy methodProxy) throws Throwable {
		Object result = null;
		// ����֮ǰ
		doBefore();
		// ����ԭʼ����ķ���
		result = methodProxy.invokeSuper(proxy, params);
		// ����֮��
		doAfter();
		return result;
	}

	private void doBefore() {
		System.out.println("before method invoke");
	}

	private void doAfter() {
		System.out.println("after method invoke");
	}

}
