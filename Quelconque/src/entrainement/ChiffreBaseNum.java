package entrainement;

public class ChiffreBaseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] tab= new Object[16];
		for(int i=0;i<=15;i++) {
			if(i<10) {
				tab[i]=i;
			}else {
				tab[i]= (char)(i+55);
			}
		}
			
		for(Object o:tab)
			System.out.print(o+" ");
	}

}
