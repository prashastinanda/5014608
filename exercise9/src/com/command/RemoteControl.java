package com.command;

public class RemoteControl {

	private Command c;

	public RemoteControl(Command c) {
		this.c = c;
	}

	public void exec() {
		c.execute();
	}
}
