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
		name = "ȫ�浿";
		height=175;
		//weight = 80;//����Ŭ�������� private �� ����Ǿ ���� �Ұ���
		setWeight(80);
				
		
	}
}
