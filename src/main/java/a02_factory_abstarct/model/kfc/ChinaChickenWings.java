package a02_factory_abstarct.model.kfc;

import a02_factory_abstarct.model.ChickenWings;

/**
 * 鸡翅实现类
 * 
 * @author maofw
 * 
 */
public class ChinaChickenWings extends ChickenWings
{
	public ChinaChickenWings(int num)
	{
		this.kind = "奥尔良";
		this.price = 2.5f;
		this.num = num;
	}
}
