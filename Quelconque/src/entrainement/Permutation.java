






package entrainement;

import java.util.HashSet;



public class Permutation {

  

     public static void permutation(String str) { 
     HashSet<Object> hh= new HashSet<>();;
    permutation("", str,hh); 
}

private static void permutation(String prefix, String str, HashSet<Object> h) {
    int n = str.length();
    if (n == 0){
    h.add(prefix);
    for (Object o:h){
      System.out.println(o);
    }}
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n),h);
    }
}
    
    


public static void main(String[] as){

  permutation("1234");
  
  
  
}

}
