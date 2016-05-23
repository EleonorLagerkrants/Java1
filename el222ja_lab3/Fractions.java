package Java1.el222ja_lab3;

public class Fractions {
	private int T;
	private int N;

	public Fractions(int T, int N) {
		this.T=T;
		if(N==0) 
			throw new ArithmeticException("Delar med noll!"); //Om man skriver n�mnaren till O skickas detta meddelande
		else this.N=N;  
	}
	public Fractions() { }

	public int getNumerator() {
		return this.T;
	}

	public int getDenominator() {
		return this.N; 
	}
	public String toString() {
		String str = "";
		return str=str+this.T+"/"+this.N;
	}

	public boolean isNegative() { //Om t�ljaren �r negativ �r br�ktalet negativt
		if(this.T<0) {
			return true; }
		return false;
	}

	public Fractions add(Fractions fr2) { 
		if(this.N==fr2.getDenominator()) { //Om br�ktalen som ska adderas har samma n�mnare adderas bara t�ljarna
			int num = (this.T+fr2.getNumerator());
			int den = (this.N);
			return new Fractions(num,den); }
		else { 
			int num = (this.T*fr2.getDenominator())+(this.N*fr2.getNumerator()); //Det f�rsta talets t�ljare multipliceras med det andra talets n�mnare och samma sak f�r andra talets t�ljare. Dessa adderas sedan
			int den = this.N*fr2.getDenominator();  //De b�da talesn n�mnare multipliceras f�r att f� samma n�mnare.
			return new Fractions(num,den); }
	}
	public Fractions subtract(Fractions fr2) {
		if(this.N==fr2.getDenominator()) {
			int num = (this.T-fr2.getNumerator());
			int den = (this.N);
			return new Fractions(num,den); }
		else {
			int num = (this.T*fr2.getDenominator())-(this.N*fr2.getNumerator());
			int den = this.N*fr2.getDenominator();
			return new Fractions(num,den); }
	}

	public Fractions multiply(Fractions fr2) {
		int num = (this.T*fr2.getNumerator());
		int den = (this.N*fr2.getDenominator());
		return new Fractions(num,den);
	}

	public Fractions divide(Fractions fr2) {
		int num = this.T*fr2.getDenominator();
		int den = this.N*fr2.getNumerator();
		return new Fractions(num,den); 
	}

	public boolean isEqualTo(Fractions fr2) {
		if(this.T==fr2.getNumerator()) {
			if(this.N==fr2.getDenominator())
				return true; }
		return false;			 
	}


}
