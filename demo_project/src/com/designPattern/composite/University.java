/**
 * 
 */
package com.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilongheng
 * @date 2020年1月22日
 * Description:University 就是 Composite , 可以管理College
 */
public class University extends OrganizationComponent{
	
	List<OrganizationComponent> components = new ArrayList<OrganizationComponent>();

	
	//构造器
	public University(String name, String des) {
		super(name, des);
	}

	/* (non-Javadoc)
	 * print方法，就是输出University 包含的学院
	 * @see com.designPattern.composite.OrganizationComponent#print()
	 */
	@Override
	protected void print() {
		// TODO Auto-generated method stub
		System.out.println("--------------" + getName() + "--------------");
		//遍历 organizationComponents 
		for(OrganizationComponent organizationComponent:components) {
			organizationComponent.print();
		}
	}

	@Override
	protected void add(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		components.add(organizationComponent);
	}

	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		components.remove(organizationComponent);											
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
	
}
