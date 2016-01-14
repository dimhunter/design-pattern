package b09_decorator;

import b09_decorator.abs.IBread;
import b09_decorator.abs.NormalBread;
import b09_decorator.decorator.CornDecorator;
import b09_decorator.decorator.SweetDecorator;

/**
 * 客户端应用程序
 * 
 * @author
 * 
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 生产装饰馒头
		System.out.println("\n====开始装饰馒头！！！");
		// 创建普通的正常馒头实例
		// 这是我们需要包装（装饰）的对象实例
		IBread normalBread = new NormalBread();

		// 下面就开始 对正常馒头进行装饰了！！！
		// 使用甜蜜素装饰馒头
		normalBread = new SweetDecorator(normalBread);
		// 使用柠檬黄的着色剂装饰馒头
		normalBread = new CornDecorator(normalBread);
		// 生产馒头信息
		//TODO 为什么包装2次就会分别打出两个子类的添加剂信息，不应该以最后一次包装为准吗？结合书最后解释研究。
		normalBread.process();
		System.out.println("====装饰馒头结束！！！");
 
	}

}
