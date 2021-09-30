package entrainement;

public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int c=1;
//		for(int i=1;i<33;i++) {
//			if(c<8) {
//				System.out.printf("%2d %s",i," ");
//				c++;
//			}else {
//				System.out.printf("%2d %s",i," ");
//				System.out.println();
//				c=1;
//			}
//		}
		
		for(int j=0;j<256;j++)
			System.out.println(j+". "+(char)j);
		
	}

}
