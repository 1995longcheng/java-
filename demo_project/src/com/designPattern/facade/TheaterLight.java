/**
 * 
 */
package com.designPattern.facade;

/**
 * @author lilongheng
 * @date 2020年2月10日
 * Description:
 */
public class TheaterLight {
	
	private static TheaterLight instance = new TheaterLight();
	
	public static TheaterLight getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println(" TheaterLight on ");
	}
	
	public void off() {
		System.out.println(" TheaterLight off ");
	}
	
	public void dim() {
		System.out.println(" TheaterLight dim.. ");
	}
	
	public void bright() {
		System.out.println(" TheaterLight bright.. ");
	}

}
