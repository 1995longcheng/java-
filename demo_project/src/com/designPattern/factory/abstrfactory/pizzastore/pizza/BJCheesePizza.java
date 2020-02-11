/**
 * 
 */
package com.designPattern.factory.abstrfactory.pizzastore.pizza;

/**
 * @author lilongheng
 * @date 2020年1月19日
 * Description:
 */
public class BJCheesePizza extends Pizza{

	/* (non-Javadoc)
	 * @see com.designPattern.factory.factoryMethod.pizzastore.pizza.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京的奶酪pizza");
		System.out.println(" 北京的奶酪pizza 准备原材料");
	}

}
