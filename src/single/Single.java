package single;


public class Single {
	//���Լ���ʵ����Ϊ�Լ��ľ�̬��Ա
	private static Single instance = null;
	//���캯��private
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
