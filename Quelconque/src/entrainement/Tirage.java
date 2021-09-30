package entrainement;

import java.util.HashSet;
import java.util.Iterator;


public class Tirage {

  public static void main(String[] args) {
     HashSet<String> hs= new HashSet<String>();
     Denombrement dn= new Denombrement();
    char[] tab ={'0','1'};
    int b= tab.length;
    int bb= 4;
    int l=tab.length;
    String s="";
  while (hs.size() != dn.pu(b, bb)) {
    for(int i=1;i<=bb;i++){
     int n= (int) (l*Math.random());
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
