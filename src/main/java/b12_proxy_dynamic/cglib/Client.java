package b12_proxy_dynamic.cglib;

public class Client {
	
	public static void main(String[] args){
		CglibProxyTest cglib=new CglibProxyTest();  
		RealSubject realobj=(RealSubject)cglib.getInstance(new RealSubject());  
		realobj.request();  
		realobj.request2();  
	}
	
}
