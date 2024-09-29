package creational.prototype;

class Bike extends Vehicle {

    public Bike() {

    }

    public Bike(Bike b) {
        super(b);
    }

    @Override
    public Vehicle clone() {
        return new Bike(this);
    }
}