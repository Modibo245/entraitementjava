package entrainement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHeure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d= new Date();
		
		SimpleDateFormat f= new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat g= new SimpleDateFormat("EEEE 'le' d MMMM yyyy");
		
		System.out.println("Date actuelle :  "+g.format(d));
		System.out.println("Heure actuelle :  "+f.format(d));
		
	}

}
