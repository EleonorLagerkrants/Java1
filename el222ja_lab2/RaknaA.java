package Java1.el222ja_lab2;

import java.util.Scanner;

public class RaknaA {

	public static void main(String[] args) {

		//L�ser in text
		Scanner scan = new Scanner(System.in); 
		System.out.print("Skriv en textrad: ");
		String text = scan.nextLine(); 
		scan.close();

		//Skapar variabler f�r a och A. Sedan skapar en sats f�r att kontrollera alla bokst�ver i meningen.
		// Om n�gon bokstav �r a eller A l�ggs det till i totalen
		int nA=0; int na=0;
		for (int i=0; i<text.length(); i++) {
			char c = text.charAt(i);
			if (c=='a')
				na++;
			if (c=='A')
				nA++;
		}

		//Skriver ut resultatet
		System.out.println("Antal a: "+na);
		System.out.println("Antal A: "+nA);




	}

}
