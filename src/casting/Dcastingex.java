package casting;

public class Dcastingex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Student("È«±æµ¿");
		Student s;
		
		s= (Student)p;
		s.grade = "A";
		s.department = "ÄÄ°ø";
		System.out.println(s.name);
		System.out.println(s.department);
		System.out.println(s.grade);
	}

}
