package c22_template;

import c22_template.template.AbstractPeople;
import c22_template.template.PeopleA;
import c22_template.template.PeopleB;
import c22_template.template.PeopleC;

/**
 * 主应用程序
 * 
 * @author
 * 
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建A、B、C三个工人
		AbstractPeople peopleA = new PeopleA();
		AbstractPeople peopleB = new PeopleB();
		AbstractPeople peopleC = new PeopleC();

		// 展示三个工人每天的行为
		peopleA.dayLift();
		peopleB.dayLift();
		peopleC.dayLift();
	}
}
