package class032802;

public class Bex extends Aex {
	public Bex() {
		super(30);// 부모클래스 생성자 선택
		System.out.println("생성자B");
	}
	public Bex(int x) {
		System.out.println("매개변수생성자B"+ x);
	}
}
