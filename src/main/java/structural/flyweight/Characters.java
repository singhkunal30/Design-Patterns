package structural.flyweight;

public class Characters implements Glyph {
	private final char symbol;

	public Characters(char symbol) {
		this.symbol = symbol;
	}

	public void render(int x, int y) {
		System.out.println("Rendering '" + symbol + "' at (" + x + ", " + y + ")");
	}
}
