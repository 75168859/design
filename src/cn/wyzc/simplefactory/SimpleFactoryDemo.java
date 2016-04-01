package cn.wyzc.simplefactory;

import java.text.DateFormat;

public class SimpleFactoryDemo {
	public static void main(String[] args) {
		DateFormat df = DateFormat.getInstance();//这本身就是简单工厂设计模式
		//创建者和使用者分离，对象要么创建对象，要么使用对象，不应该兼而有之
	}

}
