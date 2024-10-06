package structural.bridge;

//Concrete implementation 2
public class Radio implements Device {
	private boolean on = false;
	@SuppressWarnings("unused")
	private int volume = 20;

	public void turnOn() {
		on = true;
		System.out.println("Radio is turned on.");
	}

	public void turnOff() {
		on = false;
		System.out.println("Radio is turned off.");
	}

	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("Radio volume set to " + volume);
	}

	public boolean isEnabled() {
		return on;
	}
}
