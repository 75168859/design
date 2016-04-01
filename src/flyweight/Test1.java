package flyweight;

public class Test1 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1==s2);
		
		String s3 = "hello" +"world";
		String s4 = "helloworld";
		System.out.println(s3==s4);
	  //  final String sss  ="hello";
	  // String sx = sss+"world";
	   
		String s5 = s1 +"world";
		//s5 = new StringBulider(s1).append("world");
		
		System.out.println(s4==s5);
		
		
		String ss = "";
		StringBuilder builder = new StringBuilder();
		long start = System.currentTimeMillis();
		for(int i = 1; i<=100000;i++){
			builder.append("A");
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		
		Integer n1 = 1;
		Integer n2 = 1;
		System.out.println(n1==n2);
		Integer n3 = 128;
		Integer n4 = 128;
		System.out.println(n3==n4);
	}

}
