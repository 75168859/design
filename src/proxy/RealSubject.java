package proxy;

public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("real...service...");
	}

	@Override
	public void update() {
		System.out.println("udpate...");
	}

}
