package entrainement;

public class essai {

  public static void main(String[] args) {
    
    int c=1;
    for(int i=1; i<=100; i++ ){
      if(c==10){
        System.out.printf("%4d ",i);
        System.out.println();
        c=1;
      }else {
        System.out.printf("%4d ",i);
        c++;
      }
    }
    System.out.println(4 & 5);
    int a= 5 ;
    String s= Integer.toBinaryString(a);
    int d= Integer.parseInt(s);
    System.out.printf("Valeur binaire de %d sur 8 bits : ",a);
    System.out.printf("%08d",d);
    
  }

}
