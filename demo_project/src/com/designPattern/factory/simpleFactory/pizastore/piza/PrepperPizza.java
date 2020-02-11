/**
 * 
 */
package com.designPattern.factory.simpleFactory.pizastore.piza;

/**
 * @author lilongheng
 * @date 2020年1月19日
 * Description:
 */
public class PrepperPizza extends Pizza{

	/* (non-Javadoc)
	 * @see com.designPattern.factory.simpleFactory.pizastore.piza.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println(" 给胡椒披萨准备原材料 ");
	}

	
}
