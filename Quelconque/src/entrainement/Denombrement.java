package entrainement;

public class Denombrement {
	//Calcul de factoriel
	public int f(int n) {
		if (n==0) {
			return 1;
		}else {
			return n*f(n-1);
		}
	}
	//Calcul de combinaison
	public int c(int n, int p) {
		int rc= (f(n))/(f(p)*f(n-p));
		return rc;
	}
	//Calcul de arrangement
	public int a(int n, int p) {
		int ra=((f(n))/f(n-p));
		return ra;
	}
	//Calcul de p-uplet
	public int pu(int n, int p) {
		if (p==0) {
			return 1;
		}else {
			return n*pu(n,(p-1));
		}
	}
	public Denombrement(){}
}
