package zeng;
/**
 *  测试懒汉式单例模式
 *  @author	小曾公子
 * 
 * */
public class SingletonDemo2 {
	
	// 类初始化时，不初始化这个对象（延迟加载，真正用的时候再创建）。
	private static SingletonDemo2 instance = new SingletonDemo2();		
	
	// 私有构造器
	private SingletonDemo2()
	{
		
	}
	
	// 方法同步，调用效率低
	public static synchronized SingletonDemo2 getInstance()
	{
		if(instance == null)
		{
			instance = new SingletonDemo2();
		}
		return instance;
	}
	
}
