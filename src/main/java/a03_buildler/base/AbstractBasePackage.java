package a03_buildler.base;

import a03_buildler.model.MobilePackage;

public abstract class AbstractBasePackage
{
	// 手机套餐实例变量
	protected MobilePackage mobilePackage;

	public AbstractBasePackage()
	{
		this.mobilePackage = new MobilePackage();
	}
}
