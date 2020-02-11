/**
 * 
 */
package com.designPattern.facade;

/**
 * @author lilongheng
 * @date 2020年2月10日
 * Description:
 */
public class Popcorn {
	
	private static Popcorn instance = new Popcorn();
	
	public static Popcorn getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("  popcorn on ");
	}
	
	public void off() {
		System.out.println(" popcorn off ");
	}
	
	public void pop() {
		System.out.println(" popcorn is poping  ");
	}

}
