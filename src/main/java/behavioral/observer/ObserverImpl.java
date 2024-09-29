package behavioral.observer;

public class ObserverImpl implements Observer {

	public void notified() {
		System.out.println("Notification received");
	}
}
