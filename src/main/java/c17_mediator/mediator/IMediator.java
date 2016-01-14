package c17_mediator.mediator;

import c17_mediator.colleague.IUser;

/**
 * 中介者接口
 * 
 * @author
 * 
 */
public interface IMediator {
	/**
	 * 注册用户信息
	 * 
	 * @param user
	 */
	public void regist(IUser user);

	/**
	 * 发送消息给所有人
	 * 
	 * @param user
	 *            发送消息人
	 */
	public void notifyAllMessage(IUser user);
}
