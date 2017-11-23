package zeng;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程环境下五种创建单例模式的效率 
 * @author 小曾公子
 * */

public class Client3 {
	public static void main(String[] args) throws Exception {
		
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		
		for(int j=0; j<threadNum; j++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 100000; i++) {
						Object o = SingletonDemo2.getInstance();
//						Object o = SingletonDemo5.INSTANCE;
					}
					
					countDownLatch.countDown();
				}
			}).start();	
		}
		
		// main线程阻塞，直到计数器变为0，才会继续往下执行
		countDownLatch.await();	
		
		long end = System.currentTimeMillis();
		System.out.println("总耗时:" + (end-start));
	}
}
