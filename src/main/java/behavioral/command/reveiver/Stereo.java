package behavioral.command.reveiver;

//Concrete class for receiver
public class Stereo implements Device {

	public void turnOn() {
		System.out.println("Stereo is now on");
	}

	public void turnOff() {
		System.out.println("Stereo is now off");
	}

	public void adjustVolume() {
		System.out.println("Volume adjusted");
	}
}