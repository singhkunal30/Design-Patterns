package behavioral.command.reveiver;

//Concrete class for receiver
public class TV implements Device {

	public void turnOn() {
		System.out.println("TV is now on");
	}

	public void turnOff() {
		System.out.println("TV is now off");
	}

	public void changeChannel() {
		System.out.println("Channel changed");
	}
}
