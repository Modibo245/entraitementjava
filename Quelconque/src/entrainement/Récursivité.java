package entrainement;

public class Récursivité {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println(Base(1010,16));
		System.out.println(bin(5));
		
	}

	static String Base(int n, int b) {
		String[] tab= {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		
			for(int j=0;j<b;j++) {
				if(n==j)
					return tab[j];
			}
		
			int r=n%b;	
			return Base(n/b,b)+tab[r];
			
		}

	private static String bin(int a) {
		// TODO Auto-generated method stub
		
		if(a==0)
			return "0";
		if(a==1)
			return "1";
		
		return bin(a/2)+(a%2);
	}

}
