package c15_interpreter.express;

import c15_interpreter.context.Context;

/**
 * 
 * 表达式接口
 * 
 * @author
 * 
 */
public interface IExpressions {

	/**
	 * 解析
	 * 
	 * @param context
	 */
	public void parse(Context context);

	/**
	 * 执行方法
	 * 
	 * @param context
	 */
	public void interpret();
}
