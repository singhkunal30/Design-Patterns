package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class GlyphFactory {
	private final Map<Character, Glyph> characters = new HashMap<Character, Glyph>();

	public Glyph getCharacter(char symbol) {
		if (!characters.containsKey(symbol)) {
			characters.put(symbol, new Characters(symbol));
		}
		return characters.get(symbol);
	}
}
