/**
 * 
 */
package com.designPattern.factory.abstrfactory.pizzastore.pizza;

/**
 * @author lilongheng
 * @date 2020年1月19日
 * Description:
 */
public class LDCheesePizza extends Pizza{

	/* (non-Javadoc)
	 * @see com.designPattern.factory.factoryMethod.pizzastore.pizza.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦的奶酪pizza");
		System.out.println(" 伦敦的奶酪pizza 准备原材料");
	}

}
