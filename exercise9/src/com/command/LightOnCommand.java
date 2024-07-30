package com.command;

public class LightOnCommand implements Command {

	private Light l;

	public LightOnCommand(Light l) {
		this.l = l;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

		l.turnOn();
	}

}
