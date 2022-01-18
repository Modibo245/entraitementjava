package entrainement;

public class Logarithme {

  public static void main(String[] args) {
    
    double a= 2;
    System.out.print(briggs(a,0.000000001));
    
  }
  
  static double briggs(double x, double p){
  //  double m= x;
    int n= 0;
    while(Math.abs(x-1)>p){
      x= Math.sqrt(x);
      n= n+1;
    }
    x= x-1;
    while(n>0){
      x=2*x;
      n= n-1;
    }
    return x;
  }

}
