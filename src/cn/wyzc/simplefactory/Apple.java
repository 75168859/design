package cn.wyzc.simplefactory;

public class Apple extends Fruit{//�����Ʒ��ɫ

	@Override
	public void grow() {
		System.out.println("apple growing..");
	}

	@Override
	public void harvest() {
		System.out.println("apple harvest..");
	}

	@Override
	public void plaint() {
		System.out.println("apple plaint...");
	}

}
