package Java1.el222ja_lab3;

public class FractionsMain {

	public static void main(String[] args) {
		try {
			Fractions fr1 = new Fractions(23,56); 
			Fractions fr2 = new Fractions(5,6);

			System.out.println(fr1);
			System.out.println("�r br�ktalet negativt: "+fr1.isNegative());

			Fractions fr3 = fr1.add(fr2);
			System.out.println("Br�ktal 1 plus br�ktal 2: "+fr3);
			Fractions fr4 = fr1.subtract(fr2);
			System.out.println("Br�ktal 1 minus br�ktal 2: "+fr4);
			Fractions fr5 = fr1.multiply(fr2);
			System.out.println("Br�ktal 1 multiplicerat med br�ktal 2: "+fr5); 
			Fractions fr6 = fr1.divide(fr2);
			System.out.println("Br�ktal 1 dividerat med br�ktal 2: "+fr6);

			System.out.println("�r br�ktalen lika: "+fr1.isEqualTo(fr2));
		}
		catch (Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}
	}
}
