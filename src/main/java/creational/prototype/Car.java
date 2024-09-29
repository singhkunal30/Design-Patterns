package creational.prototype;

class Car extends Vehicle {

	public Car() {

	}

	public Car(Car c) {
		super(c);
	}

	@Override
	public Vehicle clone() {
		return new Car(this);
	}
}