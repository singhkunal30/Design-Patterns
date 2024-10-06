package structural.bridge;

//Concrete implementation 1
public class TV implements Device {
	private boolean on = false;
	@SuppressWarnings("unused")
	private int volume = 30;	

	public void turnOn() {
		on = true;
		System.out.println("TV is turned on.");
	}

	public void turnOff() {
		on = false;
		System.out.println("TV is turned off.");
	}

	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("TV volume set to " + volume);
	}

	public boolean isEnabled() {
		return on;
	}
}