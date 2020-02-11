/**
 * 
 */
package com.designPattern.factory.abstrfactory.pizzastore.order;

import com.designPattern.factory.abstrfactory.pizzastore.pizza.Pizza;

/**
 * @author lilongheng
 * @date 2020年1月19日
 * Description:一个抽象工厂模式的抽象层(接口)
 */
public interface AbsFactory {
	//让下面的工厂子类来 具体实现
	public Pizza createPizza(String orderType);

}
