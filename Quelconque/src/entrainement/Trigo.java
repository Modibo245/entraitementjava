package entrainement;



public class Trigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(arctan(0.001,10));
		
		double angle=15;
		double x=Math.toRadians(angle);
		
		System.out.println("tan("+angle+")="+tan(x));
		System.out.println("cos("+angle+")="+cos(x));
		System.out.println("sin("+angle+")="+sinus(x));
		
		
	}
	
	static double arctan(double x, double n) {
		double somme=0;
		for(int k=0;k<=n;k++) {
			if(k%2==0) {
				somme=somme+(Math.pow(x,2*k+1)/(2*k+1));
			}else {
				somme=somme-(Math.pow(x,2*k+1)/(2*k+1));
			}
		}
		return somme;
	}
	
	static double tan(double a) {
		double precision= Math.pow(10, -20);double[] tab=new double[101];
		tab[0]=(Math.PI / 4);
		for(int i=1;i<=100;i++) {
			tab[i]=(arctan(Math.pow(10, -i),10));
		}
		int i=0; double x=1; double y=0; double newa=0; double newx=0; double newy=0;
		
		while(a>precision) {
			while(a<tab[i]) {
				i++;
			}
			newa=a- tab[i];
			newx=x-y*Math.pow(10, -i);
			newy=y+x*Math.pow(10, -i);
			x=newx;
			y=newy;
			a=newa;
			
		}
		return y/x;
	}
	
	static double cos(double x) {
		return 1/Math.sqrt(1+tan(x)*tan(x));
	}
	
	static double sinus(double x) {
		return tan(x)/Math.sqrt(1+tan(x)*tan(x));
	}
	
}
