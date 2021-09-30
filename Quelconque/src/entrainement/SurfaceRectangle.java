package entrainement;

import java.util.Scanner;


public class SurfaceRectangle {

  public static void main(String[] args) {
     
     //déclaration
     int  s; int L; int l;
     try (Scanner sc = new Scanner(System.in)) {
		//Traitement et initialisation
		 //Ecrire
		 System.out.print("Entrer la longueur : ");
		 //Lire L
		 L = sc.nextInt();
		
		 //Ecrire
		 System.out.print("Entrer la largeur:");
		 
		 //Lire l
		 l = sc.nextInt();
	}
     
     s=L*l;
     
     //Ecrire
     
     System.out.print("La surface du rectangle est : "+s);
     
     
     
     
     
     
     
  }

}
