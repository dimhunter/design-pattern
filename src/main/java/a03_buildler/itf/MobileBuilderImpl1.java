package a03_buildler.itf;

import a03_buildler.base.AbstractBasePackage;
import a03_buildler.model.MobilePackage;

/**
 * 套餐1实现类
 * 
 * @author maofw
 * 
 */
public class MobileBuilderImpl1 extends AbstractBasePackage implements IMobileBuilder
{
	// 建造手机套餐的话费
	public void buildMoney()
	{
		this.mobilePackage.setMoney(20.0f);
	}

	// 建造手机套餐的彩玲
	public void buildMusic()
	{
		this.mobilePackage.setMusic("天使");

	}

	// 建造手机套餐的短信
	public void buildShortInfo()
	{
		this.mobilePackage.setShortInfo(400);

	}

	// 返回建造的手机套餐对象
	public MobilePackage getMobilePackage()
	{

		return this.mobilePackage;
	}

}
