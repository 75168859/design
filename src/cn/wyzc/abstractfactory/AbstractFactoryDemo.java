package cn.wyzc.abstractfactory;

public class AbstractFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnFactory af = new WhileAnFactory();
		Dog dog  = af.getDog();
		Cat cat = af.getCat();
		dog.play();
		cat.play();
		
		AnFactory af1 = new BlackAnFactory();
		Dog dog1 = af1.getDog();
		Cat cat1 = af1.getCat();
		dog1.play();
		cat1.play();

	}

}
