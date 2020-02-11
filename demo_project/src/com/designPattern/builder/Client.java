/**
 * 
 */
package com.designPattern.builder;

/**
 * @author lilongheng
 * @date 2020年1月21日
 * Description:
 */
public class Client {

	public static void main(String[] args) {
		CommonHouse commonHouse = new CommonHouse();
		commonHouse.build();
	}
}
