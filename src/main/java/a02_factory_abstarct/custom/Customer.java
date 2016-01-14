package a02_factory_abstarct.custom;

import a02_factory_abstarct.itf.IKfcFactory;
import a02_factory_abstarct.model.Beverage;
import a02_factory_abstarct.model.ChickenWings;
import a02_factory_abstarct.model.FrenchFries;
import a02_factory_abstarct.model.Hamburg;

/**
 * 客户类
 * 
 * @author maofw
 * 
 */
public class Customer
{
	// 抽象工厂
	private IKfcFactory kfcFactory;

	// 构造方法将抽象工厂作为参数传入
	public Customer(IKfcFactory kfcFactory)
	{
		this.kfcFactory = kfcFactory;
	}

	/**
	 * 订购食物
	 */
	// 订购麻辣鸡腿汉堡
	public float orderHamburg(int num)
	{
		// 获得麻辣鸡腿汉堡
		Hamburg hamburg = kfcFactory.createHamburg(num);
		// 输出订购信息
		hamburg.printMesage();
		// 返回总价
		return hamburg.totalPrice();
	}

	// 订购奥尔良烤鸡翅
	public float orderChickenWings(int num)
	{
		// 获得奥尔良烤鸡翅
		ChickenWings chickenWings = kfcFactory.createChickenWings(num);
		// 输出订购信息
		chickenWings.printMesage();
		// 返回总价
		return chickenWings.totalPrice();
	}

	// 订购薯条
	public float orderFrenchFries(int num)
	{
		// 获得薯条
		FrenchFries frenchFries = kfcFactory.createFrenchFries(num);
		// 输出订购信息
		frenchFries.printMesage();
		// 返回总价
		return frenchFries.totalPrice();
	}

	// 订购可乐
	public float orderBeverage(int num)
	{
		// 获得可乐
		Beverage beverage = kfcFactory.createBeverage(num);
		// 输出订购信息
		beverage.printMesage();
		// 返回总价
		return beverage.totalPrice();
	}
}
