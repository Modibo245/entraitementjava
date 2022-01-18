package entrainement;

public class Racin {

  static double a=2;
  public static void main(String[] args) {
     System.out.print("Racine("+a+")="+rc(a));
  }
   static  double x(int n){
      if(n==0){
        return 1 ;
      }else{
      return (x((n-1))+a/x((n-1)))/ 2;
      }
    }
    
   static  double rc(double a){
      return x(16);
    }
}
