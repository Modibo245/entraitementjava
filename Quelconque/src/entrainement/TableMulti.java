package entrainement;

public class TableMulti {

  public static void main(String[] args) {
    
    for(int i=1;i<=20;i++){
      for(int j=1;j<=10;j++){
        System.out.printf("%d x%3d =%4d",i,j,(i*j));
        System.out.println();
      }
      System.out.println();
    }
    
    
  }

}
