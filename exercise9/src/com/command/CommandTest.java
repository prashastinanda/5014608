package com.command;

public class CommandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Light l1 = new Light();
		LightOnCommand lon = new LightOnCommand(l1);
		RemoteControl rc1 = new RemoteControl(lon);
		rc1.exec();

		Light l2 = new Light();
		LightOffCommand loff = new LightOffCommand(l2);
		RemoteControl rc2 = new RemoteControl(loff);
		rc2.exec();
	}

}
