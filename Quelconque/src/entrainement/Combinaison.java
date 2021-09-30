package entrainement;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

public class Combinaison {

  public static void main(String[] args) {
     HashSet<String> hs= new HashSet<String>();
     Denombrement dn= new Denombrement();
    char[] tab ={'V','J','R','B'};
    int b= tab.length;
    int bb=3;
    String s="";
  while (hs.size() !=dn.c(b,bb) ) {
    while (s.length()<bb){
     int n= (int) (b*Math.random());
     if (!s.contains(""+tab[n])){
     
     
     s=s+tab[n];}
     
     
     }
     char[] ar=s.toCharArray();
     Arrays.sort(ar);
     
     hs.add(new String(ar));
     s="";
     
     }
    int c=1; 
    Iterator<String> it= hs.iterator();
    while(it.hasNext()){
    
      System.out.println(c+". Tirage : "+it.next());
      c++;
    }
  }

}
