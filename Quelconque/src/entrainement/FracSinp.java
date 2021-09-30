package entrainement;

import java.util.Scanner;


public class FracSinp {

  public static void main(String[] args) {
    
    System.out.println("Le numérateur :");
    Scanner s= new Scanner(System.in);
    int a= s.nextInt();
    System.out.println("Le dénominateur :");
    int b= s.nextInt();
    int d= pgcd(a,b);
    int ad= a/d;
    int bd= b/d;
    System.out.println(a+"/"+b+" a pour forme irréductible : "+ad+"/"+bd);
    s.close();
    
  }
  
  private static int pgcd(int a, int b) {
		if (b == 0)
			return a;
		return pgcd(b, a % b);
	}
  
}
