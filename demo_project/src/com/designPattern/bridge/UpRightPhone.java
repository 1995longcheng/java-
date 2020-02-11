/**
 * 
 */
package com.designPattern.bridge;

/**
 * @author lilongheng
 * @date 2020年1月21日
 * Description:
 */
public class UpRightPhone extends Phone {

	/**
	 * @param brand
	 */
	public UpRightPhone(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void open() {
		// TODO Auto-generated method stub
		super.open();
	}

	@Override
	protected void close() {
		// TODO Auto-generated method stub
		super.close();
	}

	@Override
	protected void call() {
		// TODO Auto-generated method stub
		super.call();
	}

}
