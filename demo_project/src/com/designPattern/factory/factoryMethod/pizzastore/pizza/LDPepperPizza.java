/**
 * 
 */
package com.designPattern.factory.factoryMethod.pizzastore.pizza;

/**
 * @author lilongheng
 * @date 2020年1月19日
 * Description:
 */
public class LDPepperPizza extends Pizza{

	/* (non-Javadoc)
	 * @see com.designPattern.factory.factoryMethod.pizzastore.pizza.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦的胡椒pizza");
		System.out.println(" 伦敦的胡椒pizza 准备原材料");
	}

}
