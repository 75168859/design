package cn.wyzc.factorymethod;

public class GrapeFactory extends FruitFactory{

	@Override
	public Fruit getInstance() {
		// TODO Auto-generated method stub
		return new Grape();
	}
}
