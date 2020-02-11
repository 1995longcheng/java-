/**
 * 
 */
package com.designPattern.prototype.improve;

/**
 * @author lilongheng
 * @date 2020年1月20日
 * Description:java中的Object类是所有类的根类，Object类提供了一个clone()方法，改方法可以将
 * 一个java对象复制一份，但是需要实现clone的java类必须要实现一个借口Cloneable，改接口表示该类能够复制且具有
 * 复制的能力
 */
public class Sheep implements Cloneable{

	private String name;
	private int age;
	private String color;
	private String address = "蒙古羊";
	public Sheep friend;//是对象，克隆是会如何处理？默认是浅拷贝
	/**
	 * @param name
	 * @param age
	 * @param color
	 */
	public Sheep(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", address=" + address + "]";
	}
	//克隆该实例，使用默认的clone方法来完成
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Sheep sheep = null;
		sheep = (Sheep) super.clone();
		return sheep;
	}

	
}
