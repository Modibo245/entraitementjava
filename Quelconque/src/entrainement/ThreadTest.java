package entrainement;


import java.text.SimpleDateFormat;


public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Thread clock= new Thread (){
			    
		        public void run(){
		            for(;;){
		                
		               java.util.Date d= new java.util.Date();
		                SimpleDateFormat f= null;
		                f= new SimpleDateFormat("HH:mm:ss");
		                SimpleDateFormat g= null;
		                g= new SimpleDateFormat("EEEE 'le' d MMMM yyyy");
		                
		            
		            System.out.println(f.format(d));
		            System.out.println(g.format(d));
		             try {
		                sleep(1000);
		            } catch (InterruptedException e) {
		                //TODO: handle exception
		               
		            }
		        }
		    }
		    
		} ;
		
		clock.start();
		    }
		
	}


