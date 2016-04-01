package decorator;

public class XXDe extends Decorator{

	public XXDe(Component c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void bussiness() {
		System.out.println("hello ...before...before..");
		super.bussiness();
		System.out.println("hello...after...after...");
	}

}
