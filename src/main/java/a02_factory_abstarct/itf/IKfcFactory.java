package a02_factory_abstarct.itf;

import a02_factory_abstarct.model.Beverage;
import a02_factory_abstarct.model.ChickenWings;
import a02_factory_abstarct.model.FrenchFries;
import a02_factory_abstarct.model.Hamburg;

/**
 * 肯德基抽象工厂基类接口
 * 
 * @author maofw
 * 
 */
public interface IKfcFactory
{
	// 生产汉堡
	public Hamburg createHamburg(int num);

	// 生产薯条
	public FrenchFries createFrenchFries(int num);

	// 生产鸡翅
	public ChickenWings createChickenWings(int num);

	// 生产饮料
	public Beverage createBeverage(int num);
}
