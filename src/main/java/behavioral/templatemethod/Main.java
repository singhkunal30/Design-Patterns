package behavioral.templatemethod;

public class Main {
	public static void main(String[] args) {
		// Using XMLDataProcessor
		DataProcessor xmlProcessor = new XMLDataProcessor();
		xmlProcessor.process();

		// Using JSONDataProcessor
		DataProcessor jsonProcessor = new JSONDataProcessor();
		jsonProcessor.process();
	}
}
