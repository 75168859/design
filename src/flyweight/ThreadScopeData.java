package flyweight;

import java.util.HashMap;
import java.util.Random;

public class ThreadScopeData {
	//private static HashMap<Thread, Integer> hm = new HashMap<Thread, Integer>();
	private static ThreadLocal<Integer> tl = new ThreadLocal<Integer>();
	static class A{
		 public void getData(){
			// int data = hm.get(Thread.currentThread());
			 int data = tl.get();
			 System.out.println(Thread.currentThread().getName()+"from A get data is:"+data);
			 System.out.println(Thread.currentThread().getName()+"from A "+AA.getInstance());
		 }
		 
	 }
	 static class B{
		 public void getData(){
			 //int data = hm.get(Thread.currentThread());
			 int data = tl.get();
			 System.out.println(Thread.currentThread().getName()+"from B get data is:"+data);
			 System.out.println(Thread.currentThread().getName()+"from B "+AA.getInstance());
		 }
		 
	 }
	 public static void main(String[] args) {
		for(int i = 0; i < 2;i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					int data = new Random().nextInt(10000);
					System.out.println(Thread.currentThread().getName()+" put the value is:"+data);
					//hm.put(Thread.currentThread(),data);
					tl.set(data);
					A a1 = new A();
					a1.getData();
					B b1 = new B();
					b1.getData();
					
				}
			}).start();
		}
	}
}
