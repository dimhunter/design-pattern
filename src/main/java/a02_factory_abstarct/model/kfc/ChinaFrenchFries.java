package a02_factory_abstarct.model.kfc;

import a02_factory_abstarct.model.FrenchFries;

/**
 * 薯条实现类
 * 
 * @author maofw
 * 
 */

public class ChinaFrenchFries extends FrenchFries
{
	public ChinaFrenchFries(int num)
	{
		this.kind = "普通";
		this.price = 8.0f;
		this.num = num;
	}
}
