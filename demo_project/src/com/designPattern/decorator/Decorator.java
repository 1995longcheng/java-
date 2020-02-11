/**
 * 
 */
package com.designPattern.decorator;

/**
 * @author lilongheng
 * @date 2020年1月21日
 * Description:
 */
public class Decorator extends Drink{
	private Drink obj;
	
	public Decorator(Drink obj) {
		this.obj = obj;
	}

	/* (non-Javadoc)
	 * @see com.designPattern.decorator.Drink#cost()
	 */
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		// getPrice 自己价格
		return super.getPrice() + obj.cost();
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		// obj.getDes() 输出被装饰者的信息

		return des + " " + getPrice() + " && " + obj.getDes();
	}
	
	

}
