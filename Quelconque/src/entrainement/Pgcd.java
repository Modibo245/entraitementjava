package entrainement;

public class Pgcd {
  
  public static void main(String[] args) {
		int a = 25, b = 15;
		int ans = gcd(a, b);
		System.out.println("Gcd of " + a + " and " + b + " is " + ans);
	}

	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
  
}
