package Java1.el222ja_lab2;

import java.util.Scanner;

public class RaknaA {

	public static void main(String[] args) {

		//Läser in text
		Scanner scan = new Scanner(System.in); 
		System.out.print("Skriv en textrad: ");
		String text = scan.nextLine(); 
		scan.close();

		//Skapar variabler för a och A. Sedan skapar en sats för att kontrollera alla bokstäver i meningen.
		// Om någon bokstav är a eller A läggs det till i totalen
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
