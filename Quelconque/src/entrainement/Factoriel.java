package entrainement;

import java.util.Scanner;


public class Factoriel {

	public static void main(String[] args) {
		int num, result = 1;
		Scanner ip = new Scanner(System.in);
		System.out.print("Entrer un nombre: ");
		num = ip.nextInt();
		result = findRecursion(num);
		System.out.println("Le factoriel de " + num + " est " + result);
		ip.close();
	}

	public static int findRecursion(int num) {
		if (num == 1)
			return 1;
		return (num * findRecursion(num - 1));
	}
}