package decorator;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ComponentImpl c = new ComponentImpl();
		c.bussiness();
		
		DecoratorImpl d = new DecoratorImpl(c);
		d.bussiness();
		System.out.println("=====================");
		XXDe x = new XXDe(d);
		x.bussiness();
		
		System.out.println("====================");
		new XXDe(new DecoratorImpl(new ComponentImpl())).bussiness();
	}

}
