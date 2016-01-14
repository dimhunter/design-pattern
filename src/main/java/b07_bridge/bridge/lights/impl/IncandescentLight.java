package b07_bridge.bridge.lights.impl;

import b07_bridge.bridge.lights.ILight;

/**
 * 白炽灯 实现
 * 
 * @author
 * 
 */
public class IncandescentLight implements ILight
{
	// 电流关闭
	public void electricClosed()
	{
		System.out.println("白炽灯被关闭了...");

	}

	// 接通电流
	public void electricConnected()
	{
		System.out.println("白炽灯被打开了...");
	}

	// 照明
	public void light()
	{
		System.out.println("白炽灯照明！");

	}

}
