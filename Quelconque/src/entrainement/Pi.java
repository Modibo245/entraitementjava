package entrainement;

public class Pi {

  public static void main(String[] args) {
    
    double c=0;
    double n=1000000;
    for(int i=0;i<n;i++){
      double x=Math.random();
      double y=Math.random();
      if(x*x+y*y<=1){
        c++;
      }
    }
    
    System.out.print(4*c/n);
    
  }

}
