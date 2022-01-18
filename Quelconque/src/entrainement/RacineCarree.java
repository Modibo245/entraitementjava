package entrainement;

public class RacineCarree {
  
  static double a=2;
  
  public static void main(String[] args) {
    System.out.print(racine(a));
  }
   static double x(int n){
     if(n==1){
       return 1;
     }else{
       return (x(n-1)+a/x(n-1))/2;
     }
   }
    
    static double racine(double a){
      int n=0;
      return x(n+16);
    }

}
