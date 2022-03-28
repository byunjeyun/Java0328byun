package casting;

public class Castingex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Person p;
		Student s = new Student("홍길");
		p = s; 
		System.out.println(p.name);		
		System.out.println(p.id);
		
		//업캐스팅의 경우 부모클래스는 자신이 물려준 부부만 참조가능 
		//p.grade , p.department 는 참조 불가능
	}

}
