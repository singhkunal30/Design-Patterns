package behavioral.command.commands;

import behavioral.command.reveiver.TV;

//Concrete command for changing channel of a tv
public class ChangeChannelCommand implements Command {
	private TV tv;

	public ChangeChannelCommand(TV tv) {
		this.tv = tv;
	}

	public void execute() {
		tv.changeChannel();
	}
}