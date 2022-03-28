package class032801;

public class ColorPoint extends Point {
	
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void showColorPoints() {
		System.out.print(color);
		showPoint();
	}
}