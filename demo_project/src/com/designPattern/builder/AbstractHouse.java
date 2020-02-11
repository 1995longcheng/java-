/**
 * 
 */
package com.designPattern.builder;

/**
 * @author lilongheng
 * @date 2020年1月21日
 * Description:
 */
public abstract class AbstractHouse {
	
	//打地基
	public abstract void buildBasic();
	
	//砌墙
	public abstract void buildWalls();
	
	//封顶
	public abstract void roofed();
	
	public void build() {
		buildBasic();
		buildWalls();
		roofed();
	}

}
