package cn.wyzc.simplefactory;

public class SimpleFactoryDemo2 {
	public static void main(String[] args) {
		//�����ߺ�ʹ���߷���
		Fruit fruit = FruitFactory.getInstance("banana");
		fruit.grow();
		fruit.plaint();
		fruit.harvest();
		/*��̬��Ӳ�Ʒ����Ҫ�޸Ĳ�Ʒ����Ĵ��룬����´��뼴�ɣ�
		 * ����Ҫ�޸Ĺ��������������Ͽ���ԭ��
		 * 
		 * ���˾���������У�ģʽ����һЩ���Σ����������
		 * �򵥹���+�����ļ�+����Ļ��������иĽ�
		 */
		Fruit fruit1 = FruitFactory.getInstance();
		fruit1.plaint();
		fruit1.grow();
		fruit1.harvest();
		
	}

}
