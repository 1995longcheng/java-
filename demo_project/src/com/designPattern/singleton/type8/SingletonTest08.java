/**
 * 
 */
package com.designPattern.singleton.type8;

/**
 * @author lilongheng
 * @date 2020年1月15日
 * Description:
 */
public class SingletonTest08 {
	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode = " + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
		instance.sayOK();
	}

}

//使用枚举类，可以实现单例，推荐
enum Singleton{
	INSTANCE;//属性
	public void sayOK() {
		System.out.println("ok~");
	}
}
