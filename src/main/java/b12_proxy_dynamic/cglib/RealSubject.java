package b12_proxy_dynamic.cglib;

/**
 * 具体角色,没有实现接口，所以不能用jdk的动态代理。
 * @author shen
 *
 */
public class RealSubject{
	
	/**
	 * 实现了共同接口 Subject的request()方法
	 */
	public void request() {
		System.out.println("From real subject. ");		
	}
	
	public void request2(){
		System.out.println("From real subject22222. ");		
	}

}
