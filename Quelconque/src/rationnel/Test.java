package rationnel;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Entrer le num�rateur de la 1�re fraction : ");
		int n1=sc.nextInt();
		System.out.print("Entrer le d�nominateur de la 1�re fraction : ");
		int d1=sc.nextInt();
		NombreRationnel nr1= new NombreRationnel(n1,d1);
		
		System.out.print("Entrer le num�rateur de la 2�me fraction : ");
		int n2=sc.nextInt();
		System.out.print("Entrer le d�nominateur de la 2�me fraction : ");
		int d2=sc.nextInt();
		NombreRationnel nr2= new NombreRationnel(n2,d2);
		
		sc.close();
		
		System.out.println("Premi�re fraction : "+nr1.afficher(nr1));
		//System.out.println();
		
		System.out.println("Deuxi�me fraction : "+nr2.afficher(nr2));
		System.out.println();
		
		System.out.println("Somme : "+nr1.afficher(nr1)+" + "+nr2.afficher(nr2)+" = "+nr1.afficher(nr1.aditionner(nr1, nr2)));
		System.out.println("Mutiplication : "+nr1.afficher(nr1)+" x "+nr2.afficher(nr2)+" = "+nr1.afficher(nr1.mutiplier(nr1, nr2)));
	}

}
