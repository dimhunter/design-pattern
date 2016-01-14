package b10_facade.facade;

import b10_facade.common.ISpareribs;
import b10_facade.common.Spareribs;

/**
 * 外觀模式制作糖醋排骨
 * 
 * @author
 * 
 */
public class CookFacade implements ICookFacade {
	// 糖醋排骨排骨接口
	private final ISpareribs spareribs = new Spareribs();

	// 做糖醋排骨
	public void cookSpareribs() {
		// 准备材料
		this.spareribs.prepair();
		// 腌制排骨
		this.spareribs.preserve();
		// 炸排骨
		this.spareribs.fry();
		// 调汁
		this.spareribs.juice();
	}
}
