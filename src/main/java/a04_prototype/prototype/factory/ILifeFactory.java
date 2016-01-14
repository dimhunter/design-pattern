package a04_prototype.prototype.factory;

import a04_prototype.prototype.pojo.DayLife;

/**
 * 工厂类
 * 
 * @author
 * 
 */
public interface ILifeFactory {
	/**
	 * 生产DayLife对象
	 * 
	 * @return
	 */
	public DayLife getNewInstance();
}
