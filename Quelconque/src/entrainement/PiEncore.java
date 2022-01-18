package entrainement;

public class PiEncore {

  public static void main(String[] args) {
    
    archimed(25);
    
  }
  static void archimed(int n){
    double T=4;
    double S=2*Math.sqrt(2);
    for(int i=0;i<=n;i++){
       T=2*(S*T)/(S+T);
       S=Math.sqrt(S*T);
       //System.out.println("n= "+8*Math.pow(2,i)+" T= "+T+" S= "+S);
     }
    System.out.print("PI="+S);
   }
}
