package java0328Ex;

public class Iptv extends ColorTV {
	private String ip;

	public Iptv(String ip,int size, int color) {
		super(size, color);
		this.ip = ip;
	}
		public void printProperty(){
//			int size=getSize();
		System.out.print("���� IPTV�� "+ip+ "�ּ��� ");
		super.printProperty();
	}
	
}
