package class032801;

public class Student extends Person {

	int age, height;
	
	public Student(int x, int y) {
		age= x;
		height = y;
	}
	
	
	public Student() {
	}
	public void setStudent(){
		age = 20;
		name = "홍길동";
		height=175;
		//weight = 80;//슈퍼클래스에서 private 로 선언되어서 접근 불가능
		setWeight(80);
				
		
	}
}
