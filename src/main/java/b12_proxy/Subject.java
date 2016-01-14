package b12_proxy;

/**
 * 抽象角色：声明真实对象和代理对象的共同接口；可以用抽象类或接口来实现。 
 * @author shen
 *
 */
public abstract class Subject {
	
	/**
	 * 声明的抽象方法，使子类必须实现。
	 */
	public abstract void request();
}
