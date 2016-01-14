package c16_iterator.person;

import c16_iterator.iterator.Iterator;

/**
 * 人员接口
 * 
 * @author
 * 
 */
public interface IPersonList {
	/**
	 * 获得内部存储人员信息内容
	 * 
	 * @return
	 */

	public IPerson[] getPersonList();

	/**
	 * 迭代器
	 * 
	 * @return
	 */
	public Iterator iterator();
}
