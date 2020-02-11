/**
 * 
 */
package com.designPattern.builder.improve;

/**
 * @author lilongheng
 * @date 2020年1月21日
 * Description:
 */
public class HighBuilding extends HouseBuilder{

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println(" 高楼的打地基100米 ");

	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println(" 高楼的砌墙20cm ");

	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println(" 高楼的透明屋顶 ");

	}

}
