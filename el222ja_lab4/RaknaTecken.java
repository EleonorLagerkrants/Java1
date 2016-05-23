package Java1.el222ja_lab4;

import java.io.File;
import java.util.Scanner;

public class RaknaTecken {

	public static void main(String[] args) {
		File file = new File("C:\\Temp\\ChampagneBlirDyrare.txt");
		try {
			Scanner scan = new Scanner(file);
			int lowercase1 = 0;
			int uppercase1 = 0;
			int whitespace1 = 0;
			int others1 = 0;
			String str = "";
			while(scan.hasNextLine()) {	 
				str = scan.nextLine(); //Skannar in de rader som finns i dokumentet och lägger till dem i strängen str
				for(int i=0; i<str.length(); i++) { 	//Kontrollerar varje tecken om det är: 
					if(Character.isLowerCase(str.charAt(i))) { // en liten bokstav
						lowercase1++; }
					else if(Character.isUpperCase(str.charAt(i))) { // en stor bokstav
						uppercase1++; }
					else if(Character.isWhitespace(str.charAt(i))) { // ett whitespace
						whitespace1++; }
					else others1++;										//eller ett annat tecken
				}
				whitespace1++;										//Ett whitespace läggs till för varje rad för radbrytningen,
																	//det textprogram jag använde räknade inte med dessa
			}
			whitespace1++;										
			scan.close();
			System.out.println("Små bokstäver: "+lowercase1);
			System.out.println("Stora bokstäver: "+uppercase1);
			System.out.println("Whitespace: "+whitespace1);
			System.out.println("Övriga: "+others1);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
