package entrainement;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timers {

  public static void main(String[] args) {
   TimerTask task = new TimerTask() {
			@Override
			public void run() {
				long totalMilliSec = System.currentTimeMillis();
				long totalSec = totalMilliSec / 1000;
				long currentSec = totalSec % 60;
				long totalMin = totalSec / 60;
				long currentMin = totalMin % 60;
				long totalHour = totalMin / 60;
				long currentHour = totalHour % 24;
				System.out.println("Hr:" + currentHour + " Min:" + currentMin + " Sec:" + currentSec);
			}
		};

		Timer timer = new Timer();
		timer.schedule(task, new Date(), 1000);
	}
  }


