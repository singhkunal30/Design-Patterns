package creational.singleton;

public class Eager {
	
	private static Eager instance = new Eager();
	
	private Eager() {
		
	}
	
	public static Eager getEagerInstance() {
		return instance;
	}

}
