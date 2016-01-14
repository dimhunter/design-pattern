package b12_proxy;

/**
 * 真实角色：代理角色所代表的真实对象，是我们最终要引用的对象。
 * 
 * 如果共同接口是用接口来实现，这里就是 implements 接口，如果是抽象类，就是 extends 父类。
 * @author shen
 *
 */
public class RealSubject extends Subject{
	
	/**
	 * 实现了共同接口 Subject的request()方法
	 */
	@Override
	public void request() {
		System.out.println("From real subject. ");		
	}

}
