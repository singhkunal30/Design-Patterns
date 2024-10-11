package behavioral.command.commands;

import behavioral.command.reveiver.Device;

//Concrete command for turning on device
public class TurnOnCommand implements Command {
	private Device device;

	public TurnOnCommand(Device device) {
		this.device = device;
	}

	public void execute() {
		device.turnOn();
	}
}