package proxy;

public class ProxySubject implements Subject{
	private Subject realSubject;
	public ProxySubject(Subject realSubject){
		this.realSubject = realSubject;
	}
	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("����ִ��ǰȨ�޿��ơ���������־��¼��...");
		realSubject.request();
		System.out.println("��������������־��¼�ȵ�....");
		
	}
	@Override
	public void update() {
		System.out.println("����ִ��ǰȨ�޿��ơ���������־��¼��...");
		realSubject.update();
		System.out.println("��������������־��¼�ȵ�....");
	}

}
