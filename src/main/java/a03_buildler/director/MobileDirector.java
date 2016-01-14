package a03_buildler.director;

import a03_buildler.itf.IMobileBuilder;
import a03_buildler.model.MobilePackage;

/**
 * 手机套餐指导者
 * 
 * @author maofw
 * 
 */
public class MobileDirector
{
	public MobilePackage createMobilePackage(IMobileBuilder mobileBuilder)
	{
		if (mobileBuilder != null)
		{
			// 构建话费
			mobileBuilder.buildMoney();
			// 构建短信
			mobileBuilder.buildShortInfo();
			// 构建彩玲
			mobileBuilder.buildMusic();
			// 返回手机套餐
			return mobileBuilder.getMobilePackage();

		}
		return null;
	}
}
