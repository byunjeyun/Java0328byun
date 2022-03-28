package class032801;

public class Point {

		private int x, y;// 점의위치 좌표 
		
		public void set(int x, int y) {
			this.x=x;
			this.y=y;
		}
		
		public void showPoint() {
			System.out.println("("+x+", "+y+")");//(x,y) 출력
		
		}
}
