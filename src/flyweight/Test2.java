package flyweight;

import java.util.HashMap;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AFactory factory = new AFactory();
		A xx = factory.getInstance(10);
		A yy = factory.getInstance(11);
		A zz = factory.getInstance(10);
		System.out.println(xx==zz);
	}

}
class AFactory{
	private HashMap<Integer, A> hm = new HashMap<Integer, A>();
	public A getInstance(Integer key){
		if(hm.containsKey(key)){
			return hm.get(key);
		}else{
			A a = new A(key);
			hm.put(key, a);
			return a;
		}
	}
}
class A{
	private Integer state;
	public A(Integer state){
		this.state = state;
	}
}
