package b06_adapter.power.v12;

import b06_adapter.power.AbsBasePower;

/**
 * 正常的12V电源
 * 
 * @author
 * 
 */
public class Power12 extends AbsBasePower implements IPower12 {

	// 12V电源构造方法
	public Power12() {
		super(12);
	}

	// 12V电源输出
	public void output12v() {
		System.out.println("----这是[" + this.getPower() + this.getUnit()
				+ "]电源！...");

	}

}
