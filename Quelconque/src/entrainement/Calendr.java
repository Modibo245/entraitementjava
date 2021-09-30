package entrainement;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Calendr {

  public static void main(String[] args) {
    Calendar c= new GregorianCalendar();
    
    int h= c.get(Calendar.HOUR);
    int m= c.get(Calendar.MINUTE);
    int s= c.get(Calendar.SECOND);
    
    int an= c.get(Calendar.YEAR);
    int mo= c.get(Calendar.MONTH);
    int jo= c.get(Calendar.DAY_OF_MONTH);
    
    System.out.println(h+":"+m+":"+s);
    
    System.out.println(jo+":"+mo+":"+an);
  }

}
