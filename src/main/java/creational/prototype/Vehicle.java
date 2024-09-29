package creational.prototype;

abstract class Vehicle {
	protected int seats;
	protected int tyres;
	protected String color;
	protected String fuel;

	public Vehicle() {

	}

	public Vehicle(Vehicle v) {
		if (v != null) {
			this.seats = v.seats;
			this.tyres = v.tyres;
			this.color = v.color;
			this.fuel = v.fuel;
		}
	}

	public abstract Vehicle clone();

	@Override
	public String toString() {
		return "Seats: " + this.seats + "\nTyres: " + this.tyres + "\nColor: " + this.color + "\nFuel: " + this.fuel
				+ "\n";
	}
}