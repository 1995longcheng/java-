/**
 * 
 */
package com.designPattern.facade;

/**
 * @author lilongheng
 * @date 2020年2月10日
 * Description:
 */
public class Screen {
	
	private static Screen instance = new Screen();
	
	public static Screen getInstance() {
		return instance;
	}
	
	public void up() {
		System.out.println("  Screen up  ");
	}

	public void down() {
		System.out.println(" Screen down ");
	}
}
