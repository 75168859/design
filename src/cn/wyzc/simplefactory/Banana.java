package cn.wyzc.simplefactory;

public class Banana extends Fruit{//具体产品角色

	@Override
	public void grow() {
		System.out.println("banana growing..");
	}

	@Override
	public void harvest() {
		System.out.println("banana harvest..");
	}

	@Override
	public void plaint() {
		System.out.println("banana plaint...");
	}

}
