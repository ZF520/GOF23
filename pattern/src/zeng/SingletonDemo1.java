package zeng;
/**
 *  ���Զ���ʽ����ģʽ
 *  @author	С������
 * 
 * */
public class SingletonDemo1 {
	
	// ���ʼ��ʱ�����������������û����ʱ���ص����ƣ���������ʱ����Ȼ�����̰߳�ȫ��
	private static SingletonDemo1 instance = new SingletonDemo1();		
	
	private SingletonDemo1()
	{
		
	}
	
	// ����û��ͬ��������Ч�ʸ�
	public static SingletonDemo1 getInstance()
	{
		return instance;
	}
	
	
}
