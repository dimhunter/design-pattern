package c19_observer.observer;

import c19_observer.subject.ISubject;
/**
 * 观察者接口
 * @author 
 *
 */
public interface IObserver
{
	//更新方法
	public void update(ISubject subject);
}
