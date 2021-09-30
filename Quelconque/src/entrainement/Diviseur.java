package entrainement;

public class Diviseur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 111222, b=221112;
		System.out.println("Les diviseurs de "+a+" sont :");
		for(int i=1;i<=a;i++) {
			if(a % i==0)
				System.out.print(i+" ");
		}
		
		System.out.println();
		
		System.out.println("Les diviseurs de "+b+" sont :");
		for(int k=1;k<=b;k++) {
			if(b % k==0)
				System.out.print(k+" ");
		}
		
		System.out.println();
		
		System.out.println("Les diviseurs communs de "+a+" et de "+b+" sont :");
		for(int j=1;j<=Math.max(a, b);j++) {
			if(a % j==0 && b % j==0)
				System.out.print(j+" ");
		}
		
	}

}
