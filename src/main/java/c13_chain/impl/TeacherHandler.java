package c13_chain.impl;

import c13_chain.handle.AbstractHandler;
import c13_chain.message.IStudent;

/**
 * 老师处理者
 * 
 * @author
 * 
 */
public class TeacherHandler extends AbstractHandler {

	public TeacherHandler() {
		super(1);
	}

	// 子类具体处理请求
	@Override
	public void process(IStudent student) {
		System.out.println("老师 批复：" + student.getRequestMessage());
	}

}
