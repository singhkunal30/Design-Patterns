package creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BreakSingleton {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		SynchronizedWay syncWay = SynchronizedWay.getSingletonInstance();

		// 1 break using reflection
//		Constructor<SynchronizedWay> constructor = SynchronizedWay.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		SynchronizedWay s2 = constructor.newInstance();
		System.out.println(syncWay.hashCode());

		// 2 break using serialization deserialization
		// override read resolve method
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"));
		oos.writeObject(syncWay);

		System.out.println("Serialization done");

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));
		SynchronizedWay s3 = (SynchronizedWay) ois.readObject();
		System.out.println(s3.hashCode());

		// 3 using cloning
//		SynchronizedWay s4 = (SynchronizedWay) SynchronizedWay.clone();
//		System.out.println(s4.hashCode());

	}
}
