package structural.flyweight;

public class Document {
	public static void main(String[] args) {
		GlyphFactory factory = new GlyphFactory();

		// Using the factory to get flyweight objects
		Glyph a = factory.getCharacter('a');
		Glyph b = factory.getCharacter('b');
		Glyph anotherA = factory.getCharacter('a'); // This should reuse the existing 'a'

		a.render(10, 20);
		b.render(20, 30);
		anotherA.render(40, 50); // Reuses the same 'a' object
	}
}
