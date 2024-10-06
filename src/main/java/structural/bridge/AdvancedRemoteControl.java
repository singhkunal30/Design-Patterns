package structural.bridge;

//Refined Abstraction
public class AdvancedRemoteControl extends RemoteControl {

	public AdvancedRemoteControl(Device device) {
		super(device);
	}

	public void mute() {
		System.out.println("Device is muted.");
		device.setVolume(0);
	}
}
