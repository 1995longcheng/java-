/**
 * 
 */
package com.designPattern.prototype.deepclone;

import java.io.Serializable;

/**
 * @author lilongheng
 * @date 2020年1月20日
 * Description:
 */
public class DeepCloneableTarget implements Serializable,Cloneable{

	private static final long serialVersionUID = 1L;
	
	private String cloneName;
	
	private String cloneClass;
	
	//构造器
	public DeepCloneableTarget(String cloneName, String cloneClass) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
