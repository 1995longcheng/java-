/**
 * 
 */
package com.designPattern.decorator;

/**
 * @author lilongheng
 * @date 2020年1月22日
 * Description:
 */
public class Milk extends Decorator{

	public Milk(Drink obj) {
		super(obj);
		setDes(" 牛奶 ");
		setPrice(2.0f);
	}
}
