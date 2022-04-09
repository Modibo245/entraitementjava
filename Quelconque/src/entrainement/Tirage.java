package entrainement;

import java.util.HashSet;
import java.util.Iterator;


public class Tirage {

  public static void main(String[] args) {
     HashSet<String> hs= new HashSet<String>();
     Denombrement dn= new Denombrement();
    char[] tab ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
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
    	//c+". Tirage : "+
      System.out.println(it.next());
      c++;
    }
  }

}
