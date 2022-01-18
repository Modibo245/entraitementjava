package entrainement;
import java.util.ArrayList;

public class CongruenceModulo {

  public static void main(String[] args) {
    
    int a=7;
    int n=2002;
    int b=15;
  System.out.println(a+"^"+n+" mod "+b+" = "+modulo(a,n,b));
     System.out.println("\nphi("+b+")="+phi(b));
    
  }
     static int modulo(int a,int n,int b){
      int r=n%(phi(b));
      return (int)(Math.pow(a,(r)))%b;
     }
     
     static int phi(int n){
       ArrayList al=new ArrayList();
       for(int i=1;i<=n;i++){
         if(pgcd(n,i)==1){
           al.add(i);
         }
       }
       return al.size();
     }
     static boolean isPrime(int n){
       for(int i=2;i<=Math.sqrt(n);i++){
         if(n%i==0){
           return false;
         }
       }
       return true;
     }
  private static int pgcd(int a, int b) {
		if (b == 0)
			return a;
		return pgcd(b, a % b);
	}
}
