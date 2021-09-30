package entrainement;

public class Hexadec {

  public static void main(String[] args) {
    
    
    int num = 10;
		String hex = "";
		while (num > 0) {
			int rem = num % 16;
			hex = (process(rem)) + hex;
			num = num / 16;
		}
		System.out.println("Hexadecimal value is: " + hex);
	}

	private static String process(int num) {
		String temp = "";
		if (num >= 0 && num <= 9)
			temp = temp + num;
		else
			temp = temp + (char) (num + 55);
		return temp;
  }

}
