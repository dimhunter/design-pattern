package b12_proxy_dynamic.jdk;


//客户端

public class Client{
	static public void main(String[] args) throws Throwable{
		JdkProxyTest ds = new JdkProxyTest();
		Subject subject = (Subject) ds.bind(new RealSubject());
//		Subject subject = new BoyYan();
//    	1: 得到代理
//    	2：通过代理得到真实对象
//	  	3：调用真实对象的方法
		subject.request(); 
//		subject.request2();
	}
}

