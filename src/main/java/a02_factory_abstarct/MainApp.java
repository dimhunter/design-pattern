package a02_factory_abstarct;

import a02_factory_abstarct.custom.Customer;
import a02_factory_abstarct.itf.ChinaKfcFactory;
import a02_factory_abstarct.itf.IKfcFactory;

public class MainApp
{

	/**
	 * 主应用程序方法
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		/**
		 * 定义一个肯德基（IKfcFactory类型）
		 */
		IKfcFactory kfcFactory = new ChinaKfcFactory();
		/**
		 * 爸爸和儿子走进肯德基，准备点餐
		 */
		Customer customer = new Customer(kfcFactory);
		/**
		 * 开始点餐
		 */
		// 一个麻辣鸡腿汉堡
		float hamhurgMoney = customer.orderHamburg(1);
		// 四个奥尔良烤鸡翅
		float chickenWingsMoney = customer.orderChickenWings(4);
		// 一包薯条
		float frenchFriesMoney = customer.orderFrenchFries(1);
		// 两杯可乐
		float beverageMoney = customer.orderBeverage(2);

		System.out.println("总计：" + (hamhurgMoney + chickenWingsMoney + frenchFriesMoney + beverageMoney));

	}
}
