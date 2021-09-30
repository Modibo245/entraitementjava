package entrainement;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAff {

	public static void main(String[] args) {
		
		GregorianCalendar gc= new GregorianCalendar();
		int H= gc.get(Calendar.HOUR_OF_DAY);
		int M=gc.get(Calendar.MINUTE);
		int sec= gc.get(Calendar.SECOND);
		
		System.out.println();
		System.out.println("Quelle heure fait-il ?\n");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("Il est déjà "+H+":"+M+":"+sec+" !");
		
	}

}
