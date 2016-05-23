package Java1.el222ja_lab3;

public class Fractions {
	private int T;
	private int N;

	public Fractions(int T, int N) {
		this.T=T;
		if(N==0) 
			throw new ArithmeticException("Delar med noll!"); //Om man skriver nämnaren till O skickas detta meddelande
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

	public boolean isNegative() { //Om täljaren är negativ är bråktalet negativt
		if(this.T<0) {
			return true; }
		return false;
	}

	public Fractions add(Fractions fr2) { 
		if(this.N==fr2.getDenominator()) { //Om bråktalen som ska adderas har samma nämnare adderas bara täljarna
			int num = (this.T+fr2.getNumerator());
			int den = (this.N);
			return new Fractions(num,den); }
		else { 
			int num = (this.T*fr2.getDenominator())+(this.N*fr2.getNumerator()); //Det första talets täljare multipliceras med det andra talets nämnare och samma sak för andra talets täljare. Dessa adderas sedan
			int den = this.N*fr2.getDenominator();  //De båda talesn nämnare multipliceras för att få samma nämnare.
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
