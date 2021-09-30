package entrainement;

public class BaseDeNumerationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.parseInt("BAC", 16));
		/*System.out.println(Integer.toBinaryString(4));
		System.out.println(Integer.toHexString(65536).toUpperCase());
		System.out.println(Base2(5));*/
		System.out.println(Base(3567,16));
		//System.out.println(Base(344,10));
		
	}
	static String Base2(int n) {
		
		for(int i=0;i<2;i++) {
			if(n==i)
				return ""+i;
		}
		int r= n%2;
		return Base2(n/2)+r;
		
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
	
}
