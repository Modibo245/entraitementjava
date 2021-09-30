package entrainement;

public class ExceptionManaging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 35;
		int b= 0;
		int c= 5;
		
		
		try {
			int d1= a/b;
			System.out.println("a/b = "+d1);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			int d2= a/c;
			System.out.println("a/c = "+d2);
		}
		
		
		System.out.println("Le programme continue.");
		
	}

}
