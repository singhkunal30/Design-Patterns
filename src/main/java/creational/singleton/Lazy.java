package creational.singleton;

public class Lazy {

	private static Lazy instance;

	// Private constructor to avoid instantiation
	private Lazy() {
	}

	// use this method to get instance
	// Lazy way of creating object
	public static Lazy getSingletonInstance() {
		if (instance == null) {
			instance = new Lazy();
		}
		return instance;
	}

}
