package c13_chain.impl;

import c13_chain.handle.AbstractHandler;
import c13_chain.message.IStudent;

/**
 * 班长处理者
 * 
 * @author
 * 
 */
public class SquadLeaderHandler extends AbstractHandler {

	public SquadLeaderHandler() {
		super(0);
	}

	// 子类具体处理请求
	@Override
	public void process(IStudent student) {
		System.out.println("班长 批复：" + student.getRequestMessage());
	}

}
