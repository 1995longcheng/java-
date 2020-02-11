/**
 * 
 */
package com.designPattern.decorator;

/**
 * @author lilongheng
 * @date 2020年1月21日
 * Description:
 */
public class Coffee extends Drink {

	/* (non-Javadoc)
	 * @see com.designPattern.decorator.Drink#cost()
	 */
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

}
