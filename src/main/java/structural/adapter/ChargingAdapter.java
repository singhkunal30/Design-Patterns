package structural.adapter;

public class ChargingAdapter implements AppleCharger {
	
	private SamsungCharger samsungCharger;
	
	public ChargingAdapter(SamsungCharger charger) {
		this.samsungCharger = charger;
	}

	public void chargePhone() {
		samsungCharger.chargePhone();
		System.out.println("Iphone is charging with adapter");
	}
	

}
