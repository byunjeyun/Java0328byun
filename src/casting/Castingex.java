package casting;

public class Castingex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Person p;
		Student s = new Student("ȫ��");
		p = s; 
		System.out.println(p.name);		
		System.out.println(p.id);
		
		//��ĳ������ ��� �θ�Ŭ������ �ڽ��� ������ �κθ� �������� 
		//p.grade , p.department �� ���� �Ұ���
	}

}
