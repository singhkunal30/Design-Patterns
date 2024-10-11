package behavioral.command.invoker;

import behavioral.command.commands.Command;

//Invoker
public class RemoteControl {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}
}