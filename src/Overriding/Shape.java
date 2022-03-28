package Overriding;

public class Shape {
	protected String name;
	public void paint() {
		draw();
	}	
	public Shape next;
	
	public Shape() {
	next = null;
	}

	public void draw() {
		System.out.println("Shape");
	}
}