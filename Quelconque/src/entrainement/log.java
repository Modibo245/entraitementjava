package entrainement;

public class log {

  public static void main(String[] args) {
    
    System.out.print(briggs(5));
    
  }
  
 static double briggs(double k){
   double u=1; double v=10;
   double a=0; double b=1;
    for(int i=1;i<20;i++){
      if(Math.sqrt(u*v)<k){
        u=Math.sqrt(u*v);
        a=(a+b)/2;
      }else{
        v=Math.sqrt(u*v);
        b=(a+b)/2;
      }
    }
    return (a+b)/2;
  }
  
}
