/**
 * 
 */
package com.designPattern.prototype.deepclone;

/**
 * @author lilongheng
 * @date 2020年1月20日
 * Description:
 */
public class Client {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		DeepProtoType p = new DeepProtoType();
		p.name = "宋江";
		p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");
		
		//方式1 完成深拷贝
		
		DeepProtoType p2 = (DeepProtoType) p.clone();
		System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
		System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
	}

}
