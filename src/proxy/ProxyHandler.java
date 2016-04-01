package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//��������
public class ProxyHandler implements InvocationHandler{
    private Object target;//Ŀ�����/������Ķ���
    public ProxyHandler(Object target){
    	this.target = target;
    }
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("����ǰ����־������������־��¼�ȵ�....");
		method.invoke(target, args);
		System.out.println("��������������־��¼�ȵ�....");
		return null;
	}

}
