/**
 * 
 */
package com.designPattern.factory.factoryMethod.pizzastore.order;

import com.designPattern.factory.factoryMethod.pizzastore.pizza.LDCheesePizza;
import com.designPattern.factory.factoryMethod.pizzastore.pizza.LDPepperPizza;
import com.designPattern.factory.factoryMethod.pizzastore.pizza.Pizza;

/**
 * @author lilongheng
 * @date 2020年1月19日
 * Description:
 */
public class LDOrderPizza extends OrderPizza{

	/* (non-Javadoc)
	 * @see com.designPattern.factory.factoryMethod.pizzastore.order.OrderPizza#createPizza(java.lang.String)
	 */
	@Override
	Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
