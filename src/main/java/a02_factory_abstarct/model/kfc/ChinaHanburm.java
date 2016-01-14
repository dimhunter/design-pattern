package a02_factory_abstarct.model.kfc;

import a02_factory_abstarct.model.Hamburg;

/**
 * 中国风味的麻辣鸡腿汉堡
 * 
 * @author maofw
 * 
 */
public class ChinaHanburm extends Hamburg
{
	/**
	 * 构造方法
	 * 
	 * @param kind
	 * @param price
	 * @param num
	 */
	public ChinaHanburm(int num)
	{
		this.kind = "麻辣";
		this.price = 14.0f;
		this.num = num;
	}
}
