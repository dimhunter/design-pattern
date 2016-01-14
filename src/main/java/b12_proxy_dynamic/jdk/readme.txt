动态代理模式


代理模式的不足：

如果要按照上述的方法使用代理模式，那么真实角色必须是事先已经存在的，并将其作为代理对象的内部属性。但是实际使用
时，一个真实角色必须对应一个 代理角色，如果大量使用会导致类的急剧膨胀；此外，如果事先并不知道真实角色，该如何使用代理呢？
这个问题可以通过Java的动态代理类来解决。


所谓 JDK 动态代理就是在运行时动态生成代理角色的过程。和静态代理不一样的地方是静态代理在编译期就要完成代理对象 的实现。 


Java动态代理类位于java.lang.reflect包下，一般主要涉及到以下两个类： 
(1)Interface InvocationHandler：该接口中仅定义了一个方法
public object invoke(Object obj,Method method, Object[] args)
在实际使用时，第一个参数obj一般是指代理类，method是被代理的方法，如上例中的request()，args为该方法的参数数组。 这个抽象方法在代理类中动态实现。 

(2)Proxy：该类即为动态代理类，作用类似于上例中的ProxySubject，其中主要包含以下内容
protected Proxy(InvocationHandler h)：构造函数，用于给内部的h赋值。 

static Class getProxyClass (ClassLoader loader, Class[] interfaces)：获得一个代理类，其中loader是类装载器，interfaces是真实类所拥有的全部接口的数组。 

static Object newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h)：返回代理类的一个实例，返回后的代理类可以当作被代理类使用(可使用被代理类的在Subject接口中声明过的方法)



动态代理步骤：

1.创建一个实现接口InvocationHandler的类，它必须实现invoke方法
2.创建被代理的类以及接口
3.通过Proxy的静态方法
	newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h) 创建一个代理
4.通过代理调用方法
