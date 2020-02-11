/**
 * 
 */
package com.designPattern.factory.simpleFactory.pizastore.order;

import sun.jdbc.odbc.OdbcDef;

/**
 * @author lilongheng
 * @date 2020年1月19日
 * Description:
 */
public class PizzaStore {

	public static void main(String[] args) {
//		new OrderPizza();
		
		//使用简单工厂模式
		new OrderPizza(new SimpleFactory());
	}
}
