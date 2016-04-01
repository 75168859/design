package cn.wyzc.simplefactory;

public class SimpleFactoryDemo2 {
	public static void main(String[] args) {
		//创建者和使用者分离
		Fruit fruit = FruitFactory.getInstance("banana");
		fruit.grow();
		fruit.plaint();
		fruit.harvest();
		/*动态添加产品不需要修改产品方面的代码，添加新代码即可，
		 * 但是要修改工厂，工厂不符合开闭原则
		 * 
		 * 到了具体的语言中，模式会有一些变形，来解耦操作
		 * 简单工厂+配置文件+反射的机制来进行改进
		 */
		Fruit fruit1 = FruitFactory.getInstance();
		fruit1.plaint();
		fruit1.grow();
		fruit1.harvest();
		
	}

}
