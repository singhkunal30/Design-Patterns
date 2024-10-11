package behavioral.command.commands;

import behavioral.command.reveiver.Device;

//Concrete command for turning off device
public class TurnOffCommand implements Command {
	private Device device;

	public TurnOffCommand(Device device) {
		this.device = device;
	}

	public void execute() {
		device.turnOff();
	}
}