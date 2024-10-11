package behavioral.command;

import behavioral.command.commands.AdjustVolumeCommand;
import behavioral.command.commands.ChangeChannelCommand;
import behavioral.command.commands.Command;
import behavioral.command.commands.TurnOffCommand;
import behavioral.command.commands.TurnOnCommand;
import behavioral.command.invoker.RemoteControl;
import behavioral.command.reveiver.Stereo;
import behavioral.command.reveiver.TV;

public class Main {
    public static void main(String[] args) {
        // Create devices
        TV tv = new TV();
        Stereo stereo = new Stereo();

        // Create command objects
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);
        Command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        Command changeChannelTVCommand = new ChangeChannelCommand(tv);

        // Create remote control
        RemoteControl remote = new RemoteControl();

        // Set and execute commands
        remote.setCommand(turnOnTVCommand);
        remote.pressButton(); // Outputs: TV is now on

        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton(); // Outputs: Volume adjusted

        remote.setCommand(changeChannelTVCommand);
        remote.pressButton(); // Outputs: Channel changed

        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); // Outputs: TV is now off
    }
}