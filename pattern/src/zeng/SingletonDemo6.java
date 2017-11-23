package zeng;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 *  ��������ʽ����ģʽ(��η�ֹ����ͷ����л�©��)
 *  @author	С������
 * 
 * */
public class SingletonDemo6 implements Serializable{
	
	// ���ʼ��ʱ������ʼ����������ӳټ��أ������õ�ʱ���ٴ�������
	private static SingletonDemo6 instance = new SingletonDemo6();		
	
	// ˽�й�����
	private SingletonDemo6()
	{
		if(instance != null)
		{
			throw new RuntimeException();
		}
	}
	
	// ����ͬ��������Ч�ʵ�
	public static synchronized SingletonDemo6 getInstance()
	{
		if(instance == null)
		{
			instance = new SingletonDemo6();
		}
		return instance;
	}
	
	// �����л�ʱ�����������readResolve������ֱ�ӷ��ش˷���ָ���Ķ��󡣶�����Ҫ�����ٴ����¶���
	private Object readResolve() throws ObjectStreamException
	{
		return instance;
	}
}
