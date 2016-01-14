package a03_buildler.itf;

import a03_buildler.base.AbstractBasePackage;
import a03_buildler.model.MobilePackage;

/**
 * 套餐2实现类
 * 
 * @author maofw
 * 
 */
public class MobileBuilderImpl2 extends AbstractBasePackage implements IMobileBuilder
{
	// 建造手机套餐的话费
	public void buildMoney()
	{
		this.mobilePackage.setMoney(30.0f);
	}

	// 建造手机套餐的彩玲
	public void buildMusic()
	{
		this.mobilePackage.setMusic("大海");

	}

	// 建造手机套餐的短信
	public void buildShortInfo()
	{
		this.mobilePackage.setShortInfo(600);

	}

	// 返回建造的手机套餐对象
	public MobilePackage getMobilePackage()
	{

		return this.mobilePackage;
	}

}
