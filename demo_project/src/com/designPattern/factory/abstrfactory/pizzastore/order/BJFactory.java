/**
 * 
 */
package com.designPattern.factory.abstrfactory.pizzastore.order;

import com.designPattern.factory.abstrfactory.pizzastore.pizza.BJCheesePizza;
import com.designPattern.factory.abstrfactory.pizzastore.pizza.BJPepperPizza;
import com.designPattern.factory.abstrfactory.pizzastore.pizza.Pizza;

/**
 * @author lilongheng
 * @date 2020年1月19日
 * Description://这是工厂子类
 */
public class BJFactory implements AbsFactory{

	/* (non-Javadoc)
	 * @see com.designPattern.factory.abstrfactory.pizzastore.order.AbsFactory#createPizza(java.lang.String)
	 */
	@Override
	public Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		System.out.println("~使用的是抽象工厂模式~");
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		}else if(orderType.equalsIgnoreCase("pepper")) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
