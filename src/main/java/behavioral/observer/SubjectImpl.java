package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

	List<Observer> observers = new ArrayList<Observer>();

	public void subscribe(Observer ob) {
		observers.add(ob);
	}

	public void unsubscribe(Observer ob) {
		observers.remove(ob);
	}

	public void notifyChanges() {
		for (Observer ob : observers) {
			ob.notified();
		}
	}

}
