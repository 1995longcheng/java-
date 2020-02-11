/**
 * 
 */
package com.designPattern.singleton.type7;

/**
 * @author lilongheng
 * @date 2020年1月15日
 * Description:静态内部类完成懒加载，推荐使用
 */
public class SingletonTest07 {

	public static void main(String[] args) {
		System.out.println("使用静态内部类完成单例模式");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);//true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}
}
class Singleton{
	private static volatile Singleton instance;
	
	private Singleton() {
		
	}
	
	//写一个静态内部类，该类中有一个静态属性singleton
	private static class SingletonInstance{
		private static final Singleton INSTANCE = new Singleton();
	}
	
	//提供一个静态的公有方法，直接返回静态类的属性
	public static synchronized Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
	
}
