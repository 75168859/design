package cn.wyzc.factorymethod;

public class FactoryMethodDemo {
	public static void main(String[] args) {
		FruitFactory ff = new AppleFactory();
		Fruit fruit = ff.getInstance();
		fruit.plaint();
		fruit.grow();
		fruit.harvest();
		//��̬��Ӳ�Ʒ������Ҫ��̬��ӹ���
		FruitFactory ff1 = new GrapeFactory();
		Fruit fruit1 = ff1.getInstance();
		fruit1.grow();
		fruit1.plaint();
		fruit1.harvest();
		//����Ĵ���Ҫ�����ھ���Ĺ���
		//�������������������Ҫ�ѹ�������Ĵ����������ļ�+����ķ�ʽ��ʵ��
	   //�򵥹���+�����ļ�+������ȫ�ܹ�ʵ�ָù��ܡ�
	}

}
