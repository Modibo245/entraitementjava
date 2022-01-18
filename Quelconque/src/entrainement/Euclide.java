package entrainement;

public class Euclide {

  public static void main(String[] args) {
     
     int a,b,u,v,m,r;
     r=0;u=0;m=0;
     a=6;b=7;
     while(r!=1){
       u++;
       m=a*u;
       if(b>0){
         r= m-(int)((m/b)*b);
       }else{
         r= m-(int)((m/b + 1)*b);
       }
     }
     v=(1-m)/b;
  System.out.println("Si "+a+"u+"+b+"v=1 alors :");   System.out.println("(u;v)=("+u+";"+v+")");
  }

}
