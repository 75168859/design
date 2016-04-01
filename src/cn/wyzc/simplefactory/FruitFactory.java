package cn.wyzc.simplefactory;

import java.io.IOException;
import java.util.Properties;

public class FruitFactory {
	public static Fruit getInstance(String fruit){
		if(fruit.equals("apple"))
			return new Apple();
		else if(fruit.equals("grape"))
			return new Grape();
		else if("banana".equals(fruit))
			return new Banana();
		else
			throw new RuntimeException("水果种类不存在!");
	}
	private static Properties prop = new Properties();
	static{
		try {
			prop.load(FruitFactory.class.getResourceAsStream("/cn/wyzc/simplefactory/env.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Fruit getInstance(){
		try {
			return (Fruit)Class.forName(prop.getProperty("fruit")).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
