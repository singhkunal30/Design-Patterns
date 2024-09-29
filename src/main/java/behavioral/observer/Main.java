package behavioral.observer;

public class Main {
	
	public static void main(String[] args) {
		SubjectImpl s = new SubjectImpl();
		ObserverImpl ob = new ObserverImpl();
		
		s.subscribe(ob);
		
		s.notifyChanges();
		
	}
}
