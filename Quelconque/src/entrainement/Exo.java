package entrainement;





public class Exo {

  public static void main(String[] args) {
    
    
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println((int) '0'+" ---> 0");
    System.out.println((int) 'A'+" ---> A");
    System.out.println((int) 'a'+" ---> a");
    System.out.println((char) 55);
    
    int c=1;
   
   for (int i=0; i<=127; i++){
     
     if(c==16){
       System.out.print((char) i +" ");
       System.out.println();
       c=1;
       
       }else{
         System.out.print((char) i +" ");
         c++;
       }
      
     }
    
    }
    
    }
    