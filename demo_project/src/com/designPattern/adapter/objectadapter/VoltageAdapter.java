/**
 * 
 */
package com.designPattern.adapter.objectadapter;

/**
 * @author lilongheng
 * @date 2020年1月21日
 * Description:
 */
public class VoltageAdapter implements IVoltage5V{
	private Voltage220V voltage220v;// 关联关系-聚合

	/* (non-Javadoc)
	 * @see com.designPattern.adapter.objectadapter.IVoltage5V#output5V()
	 */
	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		int dst = 0;
		if(null != voltage220v) {
			int src = voltage220v.output220V();
			System.out.println("使用对象适配器，进行适配~~");
			dst = src / 44;
			System.out.println("适配完成，输出的电压为=" + dst);
		}
		return 0;
	}

	/**
	 * @param voltage220v
	 * //通过构造器，传入一个 Voltage220V 实例
	 */
	public VoltageAdapter(Voltage220V voltage220v) {
		super();
		this.voltage220v = voltage220v;
	}
	
	

}
