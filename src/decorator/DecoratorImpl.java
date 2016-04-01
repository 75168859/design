package decorator;

public class DecoratorImpl extends Decorator{

	public DecoratorImpl(Component c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void bussiness() {
		System.out.println("hellobefore");
		super.bussiness();
		System.out.println("helloafter");
	}
	

}
