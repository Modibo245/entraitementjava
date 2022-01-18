package entrainement;

public class Exponential {

  public static void main(String[] args) {
    
    System.out.print(Math.pow(expN(),15));
    
  }
    
   static double expN(){
      double s=1;
      double p=1;
      for(int n=1;n<=18;n++){
        p=p*n;
        s=s+1/p;
      }
      return s;
    }
}
