package entrainement;

public class TianglePascal {

  public static void main(String[] args) {
  
   int n= 10;
   
   System.out.println("Triangle de Pascal pour (a+b) à la puissance "+n+" :");
    
    for (int j=0;j<=n;j++){
    
    for (int i=0;i<=j;i++){
    int z= (factoriel(j))/(factoriel(i)*factoriel(j-i));
    System.out.printf("%5d",z);
    
    }
    System.out.println();
  }}
  private  static int factoriel(int num) {
		if (num == 0)
			return 1;
		return (num * factoriel(num - 1));
	}
	
 
 
 
}
