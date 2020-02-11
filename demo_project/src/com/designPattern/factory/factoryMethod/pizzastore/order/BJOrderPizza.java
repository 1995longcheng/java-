/**
 * 
 */
package com.designPattern.factory.factoryMethod.pizzastore.order;

import com.designPattern.factory.factoryMethod.pizzastore.pizza.BJCheesePizza;
import com.designPattern.factory.factoryMethod.pizzastore.pizza.BJPepperPizza;
import com.designPattern.factory.factoryMethod.pizzastore.pizza.Pizza;

/**
 * @author lilongheng
 * @date 2020年1月19日
 * Description:
 */
public class BJOrderPizza extends OrderPizza{

	/* (non-Javadoc)
	 * @see com.designPattern.factory.factoryMethod.pizzastore.order.OrderPizza#createPizza(java.lang.String)
	 */
	@Override
	Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
