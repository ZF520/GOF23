package zeng;

/**
 *  ���Ծ�̬�ڲ���ʵ�ֵ���ģʽ
 *  ���ַ������̰߳�ȫ������Ч�ʸߣ�����ʵ������ʱ����
 *  @author	С������
 * 
 * */

public class SingletonDemo4 {
	
	private static class SingletonClassInstance
	{
		private static final SingletonDemo4 instance = new SingletonDemo4();
	}
	
	private SingletonDemo4()
	{
		
	}
	
	// ����û��ͬ��������Ч�ʸ�
	public static SingletonDemo4 getInstance()
	{
		return SingletonClassInstance.instance;
	}
	
}
