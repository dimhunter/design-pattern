package b12_proxy_dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理处理器 
 * 
 * JDK的动态代理机制只能代理实现了接口的类，而不能实现接口的类就不能实现JDK的动态代理。
 * 
 * 该代理类的内部属性为Object类，实际使用时通过该类的构造函数DynamicSubject(Object obj)对其赋值；
 * 此外，在该类还实现了invoke方法，该方法中的 method.invoke(sub,args);
 * 其实就是调用被代理对象的将要被执行的方法，方法参数sub是实际的被代理对象，
 * args为执行被代理对象相应操作所需的参数。
 * 通过动态代理类，我们可以在调用之前或之后执行一些相关操作
 */

public class JdkProxyTest implements InvocationHandler{
    private Object target;

    /**
     * 绑定委托对象并返回一个代理类 
     */
    public Object bind(Object target){
    	this.target = target;
    	//取得代理对象，target.getClass().getInterfaces()要绑定接口(这是一个缺陷，cglib弥补了这一缺陷)
        //第三个参数就是实现了InvocationHandler接口的自定义类，这里是this，表示本类
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    
    /**
     * 调用方法。
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling " + method);
        method.invoke(target, args);
        System.out.println("after calling " + method);

        return null;
	}

}
