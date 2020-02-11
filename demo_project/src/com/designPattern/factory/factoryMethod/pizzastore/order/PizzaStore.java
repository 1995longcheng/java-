/**
 * 
 */
package com.designPattern.factory.factoryMethod.pizzastore.order;

/**
 * @author lilongheng
 * @date 2020年1月19日
 * Description:
 */
public class PizzaStore {

	public static void main(String[] args) {
		String loc = "bj";//模拟获取地理位置信息
		if(loc.equalsIgnoreCase("bj")) {
			//创建北京口味的各种pizza
			new BJOrderPizza();
		}else {
			//创建伦敦口味的各种Pizza
			new LDOrderPizza();
		}
	}
}
