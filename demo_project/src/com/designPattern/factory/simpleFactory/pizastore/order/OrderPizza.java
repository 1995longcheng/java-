/**
 * 
 */
package com.designPattern.factory.simpleFactory.pizastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.designPattern.factory.simpleFactory.pizastore.piza.CheesePizza;
import com.designPattern.factory.simpleFactory.pizastore.piza.GreekPizza;
import com.designPattern.factory.simpleFactory.pizastore.piza.Pizza;
import com.designPattern.factory.simpleFactory.pizastore.piza.PrepperPizza;

/**
 * @author lilongheng
 * @date 2020年1月19日
 * Description:
 */
public class OrderPizza {
	
	/*多行注释不能嵌套，单行可以嵌套
	 * 这个不符合ocp原则，开闭原则，如果披萨种类多一个则要修改消费方
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;//订购pizza的类型
		do {
			orderType = getType();
			if(orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName(" 希腊披萨 ");
			}else if(orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName(" 奶酪披萨 ");
			}else if(orderType.equals("pepper")) {
				pizza = new PrepperPizza();
				pizza.setName(" 胡椒披萨 ");
			}else {
				break;
			}
			//输出pizza制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}while(true);
	}*/
	
	//定义一个简单工厂对象
	SimpleFactory simpleFactory ;
	Pizza pizza = null;
	
	//构造器
	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	
	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = "";//用户输入的披萨类型
		
		this.simpleFactory = simpleFactory;//设置简单工厂对象
		
		do {
			orderType = getType();
			pizza = this.simpleFactory.createPizza(orderType);
			
			//输出pizza
			if(pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("订购披萨失败");
				break;
			}
		}while(true);
	}
	
	//写一个方法，可以获取客户希望订购的披萨种类
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 种类 ：");
			return strin.readLine();
		} catch (Exception e) {
			// TODO: handle exception
			return "";
		}
	}

}
