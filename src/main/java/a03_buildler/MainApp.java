package a03_buildler;

import a03_buildler.director.MobileDirector;
import a03_buildler.itf.MobileBuilderImpl1;
import a03_buildler.itf.MobileBuilderImpl2;
import a03_buildler.model.MobilePackage;

public class MainApp
{

	/**
	 * 主应用程序
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		// 创建指导者
		MobileDirector mobileDirector = new MobileDirector();
		// 套餐1
		MobileBuilderImpl1 mobileBuilderImpl1 = new MobileBuilderImpl1();
		// 套餐2
		MobileBuilderImpl2 mobileBuilderImpl2 = new MobileBuilderImpl2();

		printMessage(mobileDirector.createMobilePackage(mobileBuilderImpl1));

		printMessage(mobileDirector.createMobilePackage(mobileBuilderImpl2));

	}

	/**
	 * 打印输出套餐信息
	 */
	public static void printMessage(MobilePackage mobilePackage)
	{
		System.out.println("--话费：" + mobilePackage.getMoney() + "\t短信：" + mobilePackage.getShortInfo() + "条\t彩玲：" + mobilePackage.getMusic());
	}
}
