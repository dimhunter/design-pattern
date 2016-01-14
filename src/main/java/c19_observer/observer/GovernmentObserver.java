package c19_observer.observer;

import c19_observer.subject.ISubject;
/**
 * 政府用户观察者
 * @author 
 *
 */
public class GovernmentObserver implements IObserver
{

	public void update(ISubject subject)
	{
		System.out.println("政府部门收到高温预警：" + subject.temperatureReport());
	}

}
