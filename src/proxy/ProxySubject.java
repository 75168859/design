package proxy;

public class ProxySubject implements Subject{
	private Subject realSubject;
	public ProxySubject(Subject realSubject){
		this.realSubject = realSubject;
	}
	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("方法执行前权限控制、事务处理、日志记录等...");
		realSubject.request();
		System.out.println("方法后事务处理，日志记录等等....");
		
	}
	@Override
	public void update() {
		System.out.println("方法执行前权限控制、事务处理、日志记录等...");
		realSubject.update();
		System.out.println("方法后事务处理，日志记录等等....");
	}

}
