package b12_proxy_dynamic.javassist;

import java.lang.reflect.InvocationTargetException;

import javassist.CannotCompileException;
import javassist.NotFoundException;

/**
 * 
 * CGLib的底层基于ASM实现，是一个高效高性能的生成库；
 * 而ASM是一个轻量级的类库，但需要涉及到JVM的操作和指令；
 * 相比而言，Javassist要简单的多，完全是基于Java的API，但其性能相比前二者要差一些。
 * 允许开发者对自己的程序自由的执行字节码层的操作，当然了，你并不需要对字节码有多深的了解，或者，你根本就不需要了解（和cglib不同）。
 * 
 * Hibernate 3.3以后版本使用Javaassit，因为两家都是JBoss公司的缘故吧。
 * Tapstry5也是使用Javaassit，
 * 
 * @author shen
 *
 */
public class Client {
	
	public static void main(String[] args) throws SecurityException, IllegalArgumentException, CannotCompileException, NotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException{
		JavassistProxyTest jssit = new JavassistProxyTest();
		jssit.test();
	}
	
}
