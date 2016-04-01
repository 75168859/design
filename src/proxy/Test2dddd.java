package proxy;

public class Test2dddd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserService us = new UserServicProxy();
		System.out.println(us.login("aaa", "123"));;
	}

}
