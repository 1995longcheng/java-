/**
 * 
 */
package com.designPattern.facade;

/**
 * @author lilongheng
 * @date 2020年2月10日
 * Description:
 */
public class Projector {
	
	private static Projector instance = new Projector();
	
	public static Projector getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println(" Projector on ");
	}
	
	public void off() {
		System.out.println(" Projector off ");
	}

}
