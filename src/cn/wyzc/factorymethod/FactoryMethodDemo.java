package cn.wyzc.factorymethod;

public class FactoryMethodDemo {
	public static void main(String[] args) {
		FruitFactory ff = new AppleFactory();
		Fruit fruit = ff.getInstance();
		fruit.plaint();
		fruit.grow();
		fruit.harvest();
		//动态添加产品，就需要动态添加工厂
		FruitFactory ff1 = new GrapeFactory();
		Fruit fruit1 = ff1.getInstance();
		fruit1.grow();
		fruit1.plaint();
		fruit1.harvest();
		//对象的创建要依赖于具体的工厂
		//如果想解耦这个依赖就需要把工厂对象的创建以配置文件+反射的方式来实现
	   //简单工厂+配置文件+反射完全能够实现该功能。
	}

}
