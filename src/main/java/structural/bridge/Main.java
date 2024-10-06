package structural.bridge;

public class Main {
	public static void main(String[] args) {
		// Create a TV device
		Device tv = new TV();

		// Control the TV using a basic remote
		RemoteControl remote = new RemoteControl(tv);
		remote.turnOn();
		remote.setVolume(50);
		remote.turnOff();

		// Create a Radio device
		Device radio = new Radio();

		// Control the Radio using an advanced remote
		AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(radio);
		advancedRemote.turnOn();
		advancedRemote.mute();
		advancedRemote.turnOff();
	}
}
