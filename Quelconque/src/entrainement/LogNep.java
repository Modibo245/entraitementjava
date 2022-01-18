package entrainement;

public class LogNep {

  public static void main(String[] args) {
    System.out.print(ln(2));
  }
   static double ln(double x){
     double s=0;
     if(x==1){
       return 0;
     }else{
       for(int k=0;k<=100;k++){
         s=s+Math.pow( (x-1)/(x+1) , 2*k+1 ) / (2*k+1);
         }
       return 2*s;
       }
   }
}