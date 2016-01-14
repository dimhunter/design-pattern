package c19_observer;

import java.util.Random;

import c19_observer.observer.CompanyObserver;
import c19_observer.observer.GovernmentObserver;
import c19_observer.observer.PersonObserver;
import c19_observer.subject.ISubject;
import c19_observer.subject.Subject;


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
		// 创建主题对象
		ISubject subject = new Subject();

		// 增加企事业单位观察者
		subject.add(new CompanyObserver());
		// 增加政府用户观察者
		subject.add(new GovernmentObserver());
		// 增加个人用户观察者
		subject.add(new PersonObserver());

		Random random = new Random();
		int i = 0;
		while (++i < 10) {
			// 设置随机温度
			subject.setTemperature(random.nextInt(45));
		}
	}
}
