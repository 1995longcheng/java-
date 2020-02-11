/**
 * 
 */
package com.designPattern.singleton.type2;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;

/**
 * @author lilongheng
 * @date 2020年1月14日
 * Description:饿汉式（静态代码块）
 */
public class SingletonTest02 {
	
	public static void main(String[] args) {
		//测试
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

//饿汉式（静态代码块）
class Singleton{
	
	private static Singleton instance;
	//1、构造器私有化，外部不能new
	private Singleton() {
		
	}
	
	static {
		instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}


