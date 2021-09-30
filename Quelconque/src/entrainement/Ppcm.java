package entrainement;

public class Ppcm {
  
  static int i = 1;

	public static void main(String[] args) {
		int a = 13, b = 20;
		int ans = lcm(a, b);
		System.out.println("LCM of " + a + " and " + b + " is " + ans);
	}

	private static int lcm(int a, int b) {
		int multiple = a * (i++);
		if (multiple % a == 0 && multiple % b == 0)
			return multiple;
		return lcm(a, b);
	}
  
}
