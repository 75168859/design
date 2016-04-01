package cglib;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 ExecutorService threadPool = 	Executors.newFixedThreadPool(3);
	 for(int i = 0; i < 10;i++){
		 final int task = i;
		 threadPool.execute(new Runnable() {
			
			@Override
			public void run() {
				for(int j = 0; j < 10;j++){
					System.out.println(Thread.currentThread().getName()+"执行第"+task+"个任务的第"+j+"次循环.");
				}
			}
		});
	 }
	}

}
