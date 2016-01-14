package a02_factory_abstarct.model;

/**
 * 
 * 食物抽象基类
 * 
 * @author maofw
 * 
 */
public abstract class AbstractBaseFood
{
	// 类别
	protected String kind;
	// 数量
	protected int num;
	// 价格
	protected float price;

	// 合计
	public float totalPrice()
	{
		return this.num * this.price;
	}

}
