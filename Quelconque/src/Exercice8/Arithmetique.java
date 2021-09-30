package Exercice8;

public class Arithmetique {
	//pgcd
	static int pgcd(int a, int b) {
		if (b == 0)
			return a;
		return pgcd(b, a % b);
	}
	//ppcm
	static int ppcm(int a, int b) {
		int i=1;
		int multiple = a * (i++);
		if (multiple % a == 0 && multiple % b == 0)
			return multiple;
		return ppcm(a, b);
	}
	//premier
	static boolean premier(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	//premier_entre
	static void premier_entre(int min, int max) {
		for(int i=min;i<=max;i++) {
			if(premier(i))
				System.out.print(""+i+" ");
		}
	}
}

