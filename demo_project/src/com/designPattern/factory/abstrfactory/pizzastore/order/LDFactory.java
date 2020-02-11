/**
 * 
 */
package com.designPattern.factory.abstrfactory.pizzastore.order;

import com.designPattern.factory.abstrfactory.pizzastore.pizza.LDCheesePizza;
import com.designPattern.factory.abstrfactory.pizzastore.pizza.LDPepperPizza;
import com.designPattern.factory.abstrfactory.pizzastore.pizza.Pizza;

/**
 * @author lilongheng
 * @date 2020年1月19日
 * Description:
 */
public class LDFactory implements AbsFactory{

	/* (non-Javadoc)
	 * @see com.designPattern.factory.abstrfactory.pizzastore.order.AbsFactory#createPizza(java.lang.String)
	 */
	@Override
	public Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		System.out.println("~使用的是抽象工厂模式~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
