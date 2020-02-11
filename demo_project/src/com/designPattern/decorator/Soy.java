/**
 * 
 */
package com.designPattern.decorator;

/**
 * @author lilongheng
 * @date 2020年1月22日
 * Description:
 */
public class Soy extends Decorator {

	public Soy(Drink obj) {
		super(obj);
		setDes(" 豆浆 ");
		setPrice(1.5f);
	}
}
