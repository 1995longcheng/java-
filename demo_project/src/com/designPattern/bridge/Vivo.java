/**
 * 
 */
package com.designPattern.bridge;

/**
 * @author lilongheng
 * @date 2020年1月21日
 * Description:
 */
public class Vivo implements Brand{

	/* (non-Javadoc)
	 * @see com.designPattern.bridge.Brand#open()
	 */
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println(" Vivo手机开机 ");

	}

	/* (non-Javadoc)
	 * @see com.designPattern.bridge.Brand#cloase()
	 */
	@Override
	public void cloase() {
		// TODO Auto-generated method stub
		System.out.println(" Vivo手机关机 ");

	}

	/* (non-Javadoc)
	 * @see com.designPattern.bridge.Brand#call()
	 */
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println(" Vivo手机打电话 ");

	}

}
