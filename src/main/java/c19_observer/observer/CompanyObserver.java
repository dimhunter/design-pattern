package c19_observer.observer;

import c19_observer.subject.ISubject;
/**
 * 企事业单位用户观察者
 * @author 
 *
 */
public class CompanyObserver implements IObserver
{

	public void update(ISubject subject)
	{
		System.out.println("企事业单位收到高温预警：" + subject.temperatureReport());

	}

}
