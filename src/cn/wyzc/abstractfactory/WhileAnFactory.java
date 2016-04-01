package cn.wyzc.abstractfactory;

public class WhileAnFactory extends AnFactory{

	@Override
	public Dog getDog() {
		// TODO Auto-generated method stub
		return new WhiteDog();
	}

	@Override
	public Cat getCat() {
		// TODO Auto-generated method stub
		return new WhiteCat();
	}
}
