/**
 * 
 */
package com.designPattern.adapter.interfaceAdapter;

/**
 * @author lilongheng
 * @date 2020年1月21日
 * Description:
 */
public class Client {
	
	public static void main(String[] agrs) {
		AbsAdapter absAdapter = new AbsAdapter() {

			@Override
			public void methd01() {
				// TODO Auto-generated method stub
				System.out.println("使用了m1的方法");
			}
			//只需要去覆盖我们 需要使用 接口方法

		};
		absAdapter.methd01();
	}

}
