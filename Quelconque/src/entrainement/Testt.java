package entrainement;

public class Testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(ecriDe_1_a_n(20));
		
		for(int j=0;j<36;j++) {
			if(j<10) {
				System.out.print("\""+j+"\""+",");
			}else {
				System.out.print("\""+(char)(j+55)+"\""+",");
			}
				
			
		}
		
	}

	private static String ecriDe_1_a_n(int i) {
		// TODO Auto-generated method stub
		String casDeBase=" "+i;
		if(i==1)
			return casDeBase;
		return ecriDe_1_a_n(i-1)+casDeBase;
	}

}
