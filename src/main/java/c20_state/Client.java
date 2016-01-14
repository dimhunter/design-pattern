package c20_state;

import java.util.Random;

import c20_state.context.Context;
import c20_state.state.EditState;


/**
 * 客户端应用
 * 
 * @author
 * 
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context();
		context.changeState(new EditState());
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			int r = random.nextInt(2);
			System.out.println("当前模式："
					+ (r == 0 ? "预览模式" : (r == 1 ? "编辑模式" : "")));
			context.doWork(r);
		}
	}
}
