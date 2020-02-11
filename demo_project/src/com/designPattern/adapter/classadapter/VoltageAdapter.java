/**
 * 
 */
package com.designPattern.adapter.classadapter;

/**
 * @author lilongheng
 * @date 2020年1月21日
 * Description:适配器类
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{

	/* (non-Javadoc)
	 * @see com.designPattern.adapter.classadapter.IVoltage5V#output5V()
	 */
	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		//获取到220V电压
		int srcV = output220V();
		int dstV = srcV / 44;//转成 5v
		return dstV;
	}

}
