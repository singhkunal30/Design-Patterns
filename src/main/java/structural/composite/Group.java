package structural.composite;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Group implements Shape {

	private List<Shape> shapes = new ArrayList<Shape>();

	// Add a shape to the group
	public void addShape(Shape shape) {
		shapes.add(shape);
	}

	// Remove a shape from the group
	public void removeShape(Shape shape) {
		shapes.remove(shape);
	}

	public void draw(String color) {
		for (Shape shape : shapes) {
			shape.draw(color);
		}
	}
}
