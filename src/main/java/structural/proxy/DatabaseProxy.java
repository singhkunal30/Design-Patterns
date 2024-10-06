package structural.proxy;

//Proxy
public class DatabaseProxy implements Database {

	private RealDatabase realDatabase;
	private String connectionString;

	public DatabaseProxy(String connectionString) {
		this.connectionString = connectionString;
	}

	public void connect() {
		if (realDatabase == null) {
			// Lazy initialization: only create the real database when needed
			realDatabase = new RealDatabase(connectionString);
		}
		realDatabase.connect();
	}

	public void disconnect() {
		if (realDatabase != null) {
			realDatabase.disconnect();
		}
	}
}
