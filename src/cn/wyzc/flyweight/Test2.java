package cn.wyzc.flyweight;

public class Test2 {

	public static void main(String[] args) {
		  EditFlyWeightFactory ewf = new EditFlyWeightFactory();
		  Edit edit = ewf.getIntance('a');
		  Edit edit2 = ewf.getIntance('b');
		  
		  Edit edit3 = ewf.getIntance('a');
		  Edit edit4 = ewf.getIntance('b');
		  System.out.println(edit==edit3);
		  System.out.println(edit2==edit4);
	}

}
