package b07_bridge;

import b07_bridge.bridge.lights.ILight;
import b07_bridge.bridge.lights.impl.CrystalLight;
import b07_bridge.bridge.lights.impl.IncandescentLight;
import b07_bridge.bridge.switchs.BaseSwitch;
import b07_bridge.bridge.switchs.sub.RemoteControlSwitch;

/**
 * 客户端应用程序
 * 
 * @author
 * 
 */
public class ClientForBridge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 白炽灯 实例
		ILight incandescentLight = new IncandescentLight();
		// 水晶灯 实例
		ILight crystalLight = new CrystalLight();

		// 一般开关
		System.out.println("-- 一般开关 -- ");
		BaseSwitch switch1 = new BaseSwitch(incandescentLight);
		switch1.makeLight();
		System.out.println("\n-- 遥控开关 -- ");
		// 遥控开关
		RemoteControlSwitch remoteControlSwitch = new RemoteControlSwitch(
				crystalLight);
		
		//直接修改为水晶灯的就可以。这就是桥接
//		RemoteControlSwitch remoteControlSwitch = new RemoteControlSwitch(
//				incandescentLight);
		
		remoteControlSwitch.makeRemoteLight(1);
	}
}
