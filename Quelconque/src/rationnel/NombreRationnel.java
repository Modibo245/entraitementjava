package rationnel;

public class NombreRationnel {
	private int num;
	private int denom;
	
	public NombreRationnel(int num, int denom) {
		super();
		this.num = num;
		this.denom = denom;
	}
	

	public NombreRationnel() {
		super();
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDenom() {
		return denom;
	}

	public void setDenom(int denom) {
		this.denom = denom;
	}
	
	public String afficher(NombreRationnel n) {
		return n.getNum()+"/"+n.getDenom();
	}
	
	public NombreRationnel aditionner(NombreRationnel a, NombreRationnel b) {
		int n=a.getNum()*b.getDenom()+b.getNum()*a.getDenom();
		int d=a.getDenom()*b.getDenom();
		return  (new NombreRationnel(n/pgcd(n,d),d/pgcd(n,d)));
	}
	public NombreRationnel mutiplier(NombreRationnel a, NombreRationnel b) {
		int n=a.getNum()*b.getNum();
		int d=a.getDenom()*b.getDenom();
		return  (new NombreRationnel(n/pgcd(n,d),d/pgcd(n,d)));
	}
	//pgcd
		static int pgcd(int a, int b) {
			if (b == 0)
				return a;
			return pgcd(b, a % b);
		}
}
