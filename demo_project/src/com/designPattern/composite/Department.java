/**
 * 
 */
package com.designPattern.composite;

/**
 * @author lilongheng
 * @date 2020年1月22日
 * Description:
 */
public class Department extends OrganizationComponent{
	
	public Department(String name, String des) {
		super(name, des);
	}

	/* (non-Javadoc)
	 * @see com.designPattern.composite.OrganizationComponent#print()
	 */
	@Override
	protected void print() {
		// TODO Auto-generated method stub
		System.out.println(getName());
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return super.getDes();
	}
	
	//add , remove 就不用写了，因为他是叶子节点


}
