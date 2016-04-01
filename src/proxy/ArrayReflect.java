package proxy;

import java.lang.reflect.Method;

public class ArrayReflect {
	public static void main(String[] args) {
		int[] a ={1,2,3,4};
		int[] b = {4,5,6,7,9};
		System.out.println(a.getClass()==b.getClass());
		System.out.println(a.getClass()==int[].class);
		
		X x = new X();
		x.f(new int[]{1,2,3});
		try {
			Class c= x.getClass();
			Method m = c.getMethod("f", int[].class);
			m.invoke(x,new int[]{12,34});
			System.out.println("====================");
		} catch (Exception e) {
			// TODO: handle exception
		}
		Arg.main(new String[]{"hello","world"});
		System.out.println("========================");
		try {
			Method m1 = Arg.class.getMethod("main", String[].class);
			Object o = new String[]{"hello","world"};
			m1.invoke(null,new Object[]{new String[]{"hello","world"}});
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		String[][] aa = {
				{"hello","world"},
				{"aaa","bbb"}
		};
		System.out.println(String[][].class==aa.getClass());
		Object o1 = aa;
		Object[] o2 = aa;
		Object[][] o3 = aa;
	}

}
class X{
	public void f(int[] a){
		for (int i : a) {
			System.out.println(i);
		}
	}
}
class Arg{
	public static void main(String[] args) {
		for (String string : args) {
			System.out.println(string);
		}
	}
}
