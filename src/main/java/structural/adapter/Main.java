package structural.adapter;

public class Main {

	public static void main(String[] args) {

		AppleCharger charger = new LightningCharger();
		Iphone iphone = new Iphone(charger);
		iphone.chargeIphone();

		SamsungCharger samsungCharger = new TypeCCharger();

		AppleCharger adapter = new ChargingAdapter(samsungCharger);

		iphone = new Iphone(adapter);

		iphone.chargeIphone();

	}

}
