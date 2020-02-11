/**
 * 
 */
package com.designPattern.factory.simpleFactory.pizastore.order;

import com.designPattern.factory.simpleFactory.pizastore.piza.CheesePizza;
import com.designPattern.factory.simpleFactory.pizastore.piza.GreekPizza;
import com.designPattern.factory.simpleFactory.pizastore.piza.Pizza;
import com.designPattern.factory.simpleFactory.pizastore.piza.PrepperPizza;

/**
 * @author lilongheng
 * @date 2020年1月19日
 * Description:简单工厂类
 */
public class SimpleFactory {
	
	//orderType 返回对应的Pizza对象
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		System.out.println("使用简单工厂模式");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName(" 希腊披萨 ");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName(" 奶酪披萨 ");
		} else if (orderType.equals("pepper")) {
			pizza = new PrepperPizza();
			pizza.setName("胡椒披萨");
		}
		
		return pizza;
	}
	
	//简单工厂模式  也叫静态工厂模式
	public static Pizza createPizza2(String orderType) {
		Pizza pizza = null;

		System.out.println("使用简单工厂模式2");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName(" 希腊披萨 ");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName(" 奶酪披萨 ");
		} else if (orderType.equals("pepper")) {
			pizza = new PrepperPizza();
			pizza.setName("胡椒披萨");
		}
		
		return pizza;
	}

}
