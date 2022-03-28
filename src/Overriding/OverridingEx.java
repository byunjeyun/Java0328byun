package Overriding;

public class OverridingEx {

	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line = new Line();
		
		Shape b = new Circle();
		b.paint();
		
	paint(line);
	paint(new Shape());
	paint(new Line());
	paint(new Rect());
//	paint(new Circle());
	}

}
