/**
 * 
 */
package com.designPattern.factory.factoryMethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.designPattern.factory.factoryMethod.pizzastore.pizza.Pizza;

/**
 * @author lilongheng
 * @date 2020年1月19日
 * Description:
 */
public abstract class OrderPizza {
	//定义一个抽象方法，createPizza , 让各个工厂子类自己实现
	abstract Pizza createPizza(String orderType);

	//构造器
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;//订购披萨的类型
		do {
			orderType = getType();
			pizza = createPizza(orderType);//抽象方法，有工厂子类完成
			//输出pizza 制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}while(true);
	}
	
	// 写一个方法，可以获取客户希望订购的披萨种类
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(" input pizza 种类：");
			return strin.readLine();
		} catch (Exception e) {
			// TODO: handle exception
			return "";
		}
	}
}
