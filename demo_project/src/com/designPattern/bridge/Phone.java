/**
 * 
 */
package com.designPattern.bridge;

/**
 * @author lilongheng
 * @date 2020年1月21日
 * Description:
 */
public abstract class Phone {
	
	//组合品牌
	private Brand brand;
	
	public Phone(Brand brand) {
		this.brand = brand;
	}
	
	protected void open() {
		this.brand.open();
	}
	
	protected void close() {
		this.brand.cloase();
	}
	
	protected void call() {
		this.brand.call();
	}

}
