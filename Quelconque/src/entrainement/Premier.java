package entrainement;
import java.util.Scanner;
public class Premier {
 
 public static void main(String[] args) {
		int n, count = 1;
		Scanner ip = new Scanner(System.in);
		System.out.println("Combien de nombres premiers ? ");
		n = ip.nextInt();
		int i = 2;
		while (count <= n) {
			if (isPrime(i)) {
				count++;
				System.out.println(i + " ");
			}
			i++;
		}
		ip.close();
	}

	private static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
 
 

