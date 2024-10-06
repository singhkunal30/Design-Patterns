package structural.composite;

//Leaf 1
public class Circle implements Shape {

	public void draw(String color) {
		System.out.println("Drawing a " + color + " Circle");
	}

}