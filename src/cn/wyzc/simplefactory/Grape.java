package cn.wyzc.simplefactory;

public class Grape extends Fruit{//�����Ʒ��ɫ

	@Override
	public void grow() {
		System.out.println("grape growing..");
	}

	@Override
	public void harvest() {
		System.out.println("grape harvest..");
	}

	@Override
	public void plaint() {
		System.out.println("grape plaint...");
	}

}
