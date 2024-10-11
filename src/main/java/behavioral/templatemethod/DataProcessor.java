package behavioral.templatemethod;

public abstract class DataProcessor {
	// Template method defining the skeleton of the algorithm
	public final void process() {
		readData();
		processData();
		saveData();
	}

	// Common steps implemented in the base class
	private void readData() {
		System.out.println("Reading data from source");
	}

	private void saveData() {
		System.out.println("Saving processed data");
	}

	// Abstract step to be implemented by subclasses
	protected abstract void processData();
}
