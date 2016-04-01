package single;

import java.lang.reflect.Constructor;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1==s2);
		
		Single1 s3 = Single1.getIntance();
		Single1 s4 = Single1.getIntance();
		System.out.println(s3==s4);
		
		
		try {
			Class c = Single.class;
			Constructor<Single> ct = c.getDeclaredConstructor();
			ct.setAccessible(true);
			Single ss =(Single)ct.newInstance();
			System.out.println(ss==s1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
