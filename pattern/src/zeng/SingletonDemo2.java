package zeng;
/**
 *  ��������ʽ����ģʽ
 *  @author	С������
 * 
 * */
public class SingletonDemo2 {
	
	// ���ʼ��ʱ������ʼ����������ӳټ��أ������õ�ʱ���ٴ�������
	private static SingletonDemo2 instance = new SingletonDemo2();		
	
	// ˽�й�����
	private SingletonDemo2()
	{
		
	}
	
	// ����ͬ��������Ч�ʵ�
	public static synchronized SingletonDemo2 getInstance()
	{
		if(instance == null)
		{
			instance = new SingletonDemo2();
		}
		return instance;
	}
	
}
