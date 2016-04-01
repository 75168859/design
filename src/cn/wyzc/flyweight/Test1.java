package cn.wyzc.flyweight;

public class Test1 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1==s2);
		
		Integer n1 = 1;
		Integer n2 = 1;
		System.out.println(n1==n2);
		
		Integer n3 = 128;
		Integer n4 = 128;
		System.out.println(n3==n4);
	}

}
