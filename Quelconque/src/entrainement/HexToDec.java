package entrainement;

public class HexToDec {
	public static void main(String[] args) {
		String hex = "FACE";
		int dec = 0;
		int x = 1;
		for (int i = hex.length() - 1; i >= 0; i--) {
			int temp = process(hex.charAt(i));
			dec = dec + (temp * x);
			x = x * 16;
		}
		System.out.println("Decimal value is: " + dec);
	}

	private static int process(char ch) {
		int num = 0;
		if (ch >= 65 && ch <= 70)
			num = (int) ch - 55;
		else
			num = (int) ch - 48;
		return num;
	}
}
