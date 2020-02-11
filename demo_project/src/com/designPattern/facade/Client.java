/**
 * 
 */
package com.designPattern.facade;

/**
 * @author lilongheng
 * @date 2020年2月10日
 * Description:
 */
public class Client {
	
	//这里直接调用。。。很麻烦
	public static void main(String[] args) {
		HomeTheaterFacade homeTheaterFacade = new  HomeTheaterFacade();
		homeTheaterFacade.ready();
		homeTheaterFacade.play();
		homeTheaterFacade.end();
	}

}
