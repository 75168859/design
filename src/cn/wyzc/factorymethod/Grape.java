package cn.wyzc.factorymethod;

public class Grape extends Fruit{

	@Override
	public void grow() {
		System.out.println("grape grow...");
	}

	@Override
	public void harvest() {
		System.out.println("grape havest...");
	}

	@Override
	public void plaint() {
		System.out.println("grape plaint...");
	}
	
}
