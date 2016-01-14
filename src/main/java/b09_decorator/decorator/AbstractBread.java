package b09_decorator.decorator;

import b09_decorator.abs.IBread;

/**
 * 抽象装饰者
 * 
 * @author
 * 
 */
public abstract class AbstractBread implements IBread {
	// 存储传入的IBread对象
	private final IBread bread;

	public AbstractBread(IBread bread) {
		this.bread = bread;
	}

	// 准备材料
	public void prepair() {
		this.bread.prepair();
		System.out.println("【抽象装饰者】准备面粉、水以及发酵粉..."+this.bread.getClass().getName());
	}

	// 和面
	public void kneadFlour() {
		this.bread.kneadFlour();
		System.out.println("【抽象装饰者】和面..."+this.bread.getClass().getName());
	}

	// 蒸馒头
	public void steamed() {
		this.bread.steamed();
		System.out.println("【抽象装饰者】蒸馒头...香喷喷的馒头出炉了！"+this.bread.getClass().getName());
	}

	// 加工馒头方法
	public void process() {
		prepair();
		kneadFlour();
		steamed();

	}
}
