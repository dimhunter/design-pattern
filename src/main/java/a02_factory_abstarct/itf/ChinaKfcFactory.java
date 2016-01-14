package a02_factory_abstarct.itf;

import a02_factory_abstarct.model.Beverage;
import a02_factory_abstarct.model.ChickenWings;
import a02_factory_abstarct.model.FrenchFries;
import a02_factory_abstarct.model.Hamburg;
import a02_factory_abstarct.model.kfc.ChinaBeverage;
import a02_factory_abstarct.model.kfc.ChinaChickenWings;
import a02_factory_abstarct.model.kfc.ChinaFrenchFries;
import a02_factory_abstarct.model.kfc.ChinaHanburm;

/**
 * 具体肯德基接口工厂实现类。
 * @author shen
 *
 */
public class ChinaKfcFactory implements IKfcFactory
{

	/**
	 * 生产可乐
	 */
	public Beverage createBeverage(int num)
	{
		return new ChinaBeverage(num);
	}

	// 生产奥尔良烤鸡翅
	public ChickenWings createChickenWings(int num)
	{
		return new ChinaChickenWings(num);
	}

	// 生产薯条
	public FrenchFries createFrenchFries(int num)
	{
		return new ChinaFrenchFries(num);
	}

	// 生产麻辣风味鸡腿汉堡
	public Hamburg createHamburg(int num)
	{
		return new ChinaHanburm(num);
	}

}
