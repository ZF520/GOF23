package zeng;

public class Client {
	public static void main(String[] args) {
		SingletonDemo1 s1 = SingletonDemo1.getInstance();
		SingletonDemo1 s2 = SingletonDemo1.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(SingletonDemo5.INSTANCE==SingletonDemo5.INSTANCE);
	}
}
