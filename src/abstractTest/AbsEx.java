package abstractTest;

public class AbsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.sub(2, 3));
		System.out.println(c.average(new int [] {2, 3, 4}));
	}

}
