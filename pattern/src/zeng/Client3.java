package zeng;

import java.util.concurrent.CountDownLatch;

/**
 * ���Զ��̻߳��������ִ�������ģʽ��Ч�� 
 * @author С������
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
		
		// main�߳�������ֱ����������Ϊ0���Ż��������ִ��
		countDownLatch.await();	
		
		long end = System.currentTimeMillis();
		System.out.println("�ܺ�ʱ:" + (end-start));
	}
}
