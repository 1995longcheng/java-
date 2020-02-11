/**
 * 
 */
package com.designPattern.factory.abstrfactory.pizzastore.order;

/**
 * @author lilongheng
 * @date 2020年1月19日
 * Description:
 */
public class PizzaStore {

	public static void main(String[] args) {
		new OrderPizza(new LDFactory());
	}
}
