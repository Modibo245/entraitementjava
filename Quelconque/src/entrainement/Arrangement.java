package entrainement;

import java.util.HashSet;
import java.util.Iterator;


public class Arrangement {

  public static void main(String[] args) {
     HashSet<String> hs= new HashSet<String>();
     Denombrement dn= new Denombrement();
    char[] tab ={'1','2','3','4'};
    int b= tab.length;
    int bb= 2;
    String s="";
  while (hs.size() !=dn.a(b,bb) ) {
    while (s.length()<b){
     int n= (int) (b*Math.random());
     if (!s.contains(""+tab[n]))
     s=s+tab[n];
     
     
     }
     hs.add(s);
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
