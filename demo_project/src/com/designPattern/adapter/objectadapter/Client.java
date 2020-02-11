/**
 * 
 */
package com.designPattern.adapter.objectadapter;

/**
 * @author lilongheng
 * @date 2020年1月21日
 * Description:
 */
public class Client {

	public static void main(String[] args) {
		System.out.println(" === 对象适配器模式 ====");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter(new Voltage220V()));
	}
}
