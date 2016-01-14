package b12_proxy_dynamic.jdk;

/**
 * 具体角色
 * @author shen
 *
 */
public class RealSubject implements Subject{
	
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
