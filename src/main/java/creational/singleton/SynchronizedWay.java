package creational.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

@SuppressWarnings("serial")
public class SynchronizedWay implements Serializable, Cloneable {

	private static SynchronizedWay instance;

	// Private constructor to avoid instantiation
	private SynchronizedWay() {
		// for reflection safe
		if (instance != null) {
			throw new IllegalStateException(
					"Instance already exists. Use getSingletonInstance() to get the single instance.");
		}

	}

	// use this method to get instance
	// Lazy way of creating object
	// Use block synchronization
	public static SynchronizedWay getSingletonInstance() {
		if (instance == null) {
			synchronized (SynchronizedWay.class) {
				if (instance == null) {
					instance = new SynchronizedWay();
				}
			}
		}
		return instance;
	}

	private Object readResolve() throws ObjectStreamException {
		// Return the one true instance to ensure singleton
		return getSingletonInstance();
	}

	@Override
	public Object clone() {
		return getSingletonInstance();
	}

}
