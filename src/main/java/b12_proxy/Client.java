package b12_proxy;

public class Client {
	/**
	 * main测试
	 */
	public static void main(String[] args){
		//new一个代理对象，操作代理对象即可。不需要调用真实对象，这就是代理的好处。
		Subject sub = new ProxySubject();
        sub.request();
	}
}
