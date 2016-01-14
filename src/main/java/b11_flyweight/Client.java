package b11_flyweight;

import java.util.Random;

import b11_flyweight.factory.FiveChessmanFactory;
import b11_flyweight.object.AbstractChessman;


/**
 * 主应用程序
 * 
 * @author
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建五子棋工厂
		FiveChessmanFactory fiveChessmanFactory = FiveChessmanFactory
				.getInstance();
		Random random = new Random();
		int radom = 0;
		AbstractChessman abstractChessman = null;
		// 随机获得棋子
		for (int i = 0; i < 10; i++) {

			radom = random.nextInt(2);
			switch (radom) {
			// 获得黑棋
			case 0:
				abstractChessman = fiveChessmanFactory.getChessmanObject('B');
				break;
			// 获得白棋
			case 1:
				abstractChessman = fiveChessmanFactory.getChessmanObject('W');
				break;
			}

			if (abstractChessman != null) {
				abstractChessman.point(i, radom);
			}

		}
	}
}
