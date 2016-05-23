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
				str = scan.nextLine(); //Skannar in de rader som finns i dokumentet och l�gger till dem i str�ngen str
				for(int i=0; i<str.length(); i++) { 	//Kontrollerar varje tecken om det �r: 
					if(Character.isLowerCase(str.charAt(i))) { // en liten bokstav
						lowercase1++; }
					else if(Character.isUpperCase(str.charAt(i))) { // en stor bokstav
						uppercase1++; }
					else if(Character.isWhitespace(str.charAt(i))) { // ett whitespace
						whitespace1++; }
					else others1++;										//eller ett annat tecken
				}
				whitespace1++;										//Ett whitespace l�ggs till f�r varje rad f�r radbrytningen,
																	//det textprogram jag anv�nde r�knade inte med dessa
			}
			whitespace1++;										
			scan.close();
			System.out.println("Sm� bokst�ver: "+lowercase1);
			System.out.println("Stora bokst�ver: "+uppercase1);
			System.out.println("Whitespace: "+whitespace1);
			System.out.println("�vriga: "+others1);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
