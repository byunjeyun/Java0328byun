package Overriding;

public class Circle extends Shape {
	protected String name;
	
	public void draw() {
		name = "Circle";
		super.name = "Shape";
		super.draw();
		System.out.println(name);
	}
}


