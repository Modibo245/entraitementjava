package entrainement;

public class EulerF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7,b=0;
		for(int i=1;i<=a;i++) {
			if(gcd(i,a)==1)
				b++;
		}
		System.out.println(b);
	}
	
	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
	
}
