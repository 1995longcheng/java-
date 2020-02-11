/**
 * 
 */
package com.designPattern.bridge;

/**
 * @author lilongheng
 * @date 2020年1月21日
 * Description:折叠式手机类，继承 抽象类 Phone
 */
public class FoldedPhone extends Phone{

	/**
	 * @param brand
	 */
	public FoldedPhone(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void open() {
		// TODO Auto-generated method stub
		super.open();
		System.out.println(" 折叠样式手机 ");
	}

	@Override
	protected void close() {
		// TODO Auto-generated method stub
		super.close();
		System.out.println(" 折叠样式手机 ");
	}

	@Override
	protected void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println(" 折叠样式手机 ");
	}

}
