package com.command;

public class LightOffCommand implements Command {

	private Light l;

	public LightOffCommand(Light l) {
		this.l = l;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

		l.turnOff();
	}

}
