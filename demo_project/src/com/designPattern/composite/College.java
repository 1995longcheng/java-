/**
 * 
 */
package com.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilongheng
 * @date 2020年1月22日
 * Description:
 */
public class College extends OrganizationComponent{

	//List 中 存放的Department
	List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();
	
	public College(String name, String des) {
		super(name,des);
	}
	

	@Override
	protected void add(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		organizationComponents.add(organizationComponent);
	}


	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		organizationComponents.remove(organizationComponent);
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

	/* (non-Javadoc)
	 *  print方法，就是输出University 包含的学院
	 * @see com.designPattern.composite.OrganizationComponent#print()
	 */
	@Override
	protected void print() {
		// TODO Auto-generated method stub
		System.out.println("--------------" + getName() + "--------------");
		for(OrganizationComponent organizationComponent:organizationComponents) {
			organizationComponent.print();
		}
		
	}
}
