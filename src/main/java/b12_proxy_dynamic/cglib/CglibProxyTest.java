package b12_proxy_dynamic.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * JDK的动态代理机制只能代理实现了接口的类，而不能实现接口的类就不能实现JDK的动态代理。
 * 
 * cglib封装了asm，可以在运行期动态生成新的class。
	cglib用于AOP，jdk中的proxy必须基于接口，cglib却没有这个限制。
 * 
 * cglib是针对类来实现代理的，他的原理是对指定的目标类生成一个子类，并覆盖其中方法实现增强，
 * 但因为采用的是继承，所以不能对final修饰的类进行代理。 
 * 
 * CGLIB具有简单易用，它的运行速度要远远快于JDK的Proxy动态代理：
	使用CGLIB需要导入以下两个jar文件：
    	asm.jar – CGLIB的底层实现。
    	cglib.jar – CGLIB的核心jar包。
	CGLIB的核心类：
    	net.sf.cglib.proxy.Enhancer – 主要的增强类
		net.sf.cglib.proxy.MethodInterceptor – 主要的方法拦截类，它是Callback接口的子接口，需要用户实现
 * 
 * 这是拦截RealSubject中所有的方法，如果只拦截某方法，就需要 implements CallbackFilter ,暂没必要了解，知道这回事即可。
 * @author shen
 *
 */
public class CglibProxyTest implements MethodInterceptor {
	
	private Object target;
	
	/**
	 * 创建代理对象
	 * @param target
	 * @return
	 */
	public Object getInstance(Object target) {  
		this.target = target;  
		Enhancer enhancer = new Enhancer();  
		enhancer.setSuperclass(this.target.getClass());  
		// 回调方法  
		enhancer.setCallback(this);  
		// 创建代理对象  
		return enhancer.create();  
	} 
	
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args,MethodProxy proxy) throws Throwable {
		System.out.println("before calling " + method);
		proxy.invokeSuper(obj, args);  
		System.out.println("after calling " + method);
		return null;
	}
	
}
