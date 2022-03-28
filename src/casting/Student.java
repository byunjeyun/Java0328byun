package casting;

public class Student extends Person{

	String grade;
	String department;
	
	
	public Student(String name) {
	super(name);
	}


	public Student(String name, String grade, String department) {
		super(name);
		this.grade = grade;
		this.department = department;
	}
	
	
		
}
