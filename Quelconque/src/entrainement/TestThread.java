package entrainement;



public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1= new Thread() {
			public void run() {
				for(int i= 1; i<=10; i++)
					System.out.println(i+"i");
			}
		};
		
		
		Thread t2= new Thread() {
			public void run() {
				for(int j=1; j<=10; j++)
					System.out.println(j+"j");
			}
			
		};
		
		
		t1.start();
		t2.start();
	}

}
