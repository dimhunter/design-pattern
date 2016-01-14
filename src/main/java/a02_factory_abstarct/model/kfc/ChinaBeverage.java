package a02_factory_abstarct.model.kfc;

import a02_factory_abstarct.model.Beverage;

/**
 * 饮料实现类
 * 
 * @author maofw
 * 
 */
public class ChinaBeverage extends Beverage
{

	public ChinaBeverage(int num)
	{
		this.kind = "可乐";
		this.price = 7.0f;
		this.num = num;
	}
}
