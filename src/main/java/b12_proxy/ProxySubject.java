package b12_proxy;

/**
 * 代理角色：代理对象角色内部含有对真实对象的引用，从而可以操作真实对象，同时代理对象提供与真实对象相同的接口以便
 *			在任何时刻都能代替真实对象。同时，代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装。 
 *			
 *	如果共同接口是用接口来实现，这里就是 implements 接口，如果是抽象类，就是 extends 父类。
 * @author shen
 *
 */
public class ProxySubject extends Subject{
	
	private RealSubject realSubject; // 以真实角色作为代理角色的属性
	
	/**
	 * 实现了共同接口 Subject的request()方法
	 * 
	 * 该方法封装了真实对象的request方法。代理角色：自己并不实现业务逻辑接口，而是调用真实角色来实现
	 */
	@Override
	public void request() {
		preRequest();

        if (realSubject == null){
            realSubject = new RealSubject();
        }

        realSubject.request(); // 此处执行真实对象的request方法

        postRequest();
	}
	
	
	/*
	 * something you want to do before requesting
	 */
    private void preRequest(){
    	System.out.println(" 请求前准备  ");
    }
    
    /*
     * something you want to do after requesting
     */
    private void postRequest(){
    	System.out.println(" 请求完成后doSomething  ");
    }

}
