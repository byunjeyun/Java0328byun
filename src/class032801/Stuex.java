package class032801;

public class Stuex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student(24, 155);
		stu.setStudent();
		System.out.println("나이"+stu.age);
		System.out.println("키"+stu.height);
		System.out.print("몸무게"+stu.getWeight());
	}

}
