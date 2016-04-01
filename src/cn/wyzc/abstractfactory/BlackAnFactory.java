package cn.wyzc.abstractfactory;

public class BlackAnFactory extends AnFactory{

	@Override
	public Dog getDog() {
		// TODO Auto-generated method stub
		return new Dog(){

			@Override
			public void play() {
			   System.out.println("black dog playing...");
			}
			
		};
	}

	@Override
	public Cat getCat() {
		// TODO Auto-generated method stub
		return new Cat(){
			@Override
			public void play() {
				System.out.println("black cat playing...");
			}
		};
	}
	
}
