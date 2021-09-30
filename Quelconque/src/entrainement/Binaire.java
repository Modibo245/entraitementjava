package entrainement;

public class Binaire {

  public static void main(String[] args) {
    int dNum = 16;
		String str = "";
		while (dNum > 0) {
			int rem = dNum % 2;
			str = rem + str;
			dNum = dNum / 2;
		}
		System.out.println("En binaire: " + str);
	}
  }


