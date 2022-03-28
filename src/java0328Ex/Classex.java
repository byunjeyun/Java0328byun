package java0328Ex;

public class Classex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		Iptv iptv = new Iptv("192.1.1.2", 32, 2048);
		iptv.printProperty();
		}
	
}
