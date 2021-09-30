package entrainement;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Chaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Aa";
		byte[] btab=s.getBytes();
		for(byte b:btab)
			System.out.println(b);
		System.out.println();
		
		try {
			InetAddress adr= InetAddress.getByName("192.168.43.1");
			System.out.print(adr.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
