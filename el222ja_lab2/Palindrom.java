package Java1.el222ja_lab2;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Palindrom {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder(""); //Skapar en tom Stringbuilder
		Scanner scan = new Scanner(System.in);
		System.out.print("Skriv en textrad: ");
		String text = (scan.nextLine()); 
		text = text.toLowerCase(); //Gör den inlästa texten till små bokstäver
		scan.close();
		
		for (int i=0; i<text.length(); i++) {
		 char c = text.charAt(i); 
		 if (Character.isLetter(c)) { //Kontrollerar varje tecken i strängen för att se om de är bokstäver
			 str.append(c); //Om de är bokstäver läggs de till i den tomma StringBuildern str
		 }
		}
		 String reverse= str.toString(); // Jag gör str till en vanlig string(reverse)
		 str = str.reverse(); 
		 String reverse_string = str.toString(); //jag gör även str omvänd till en string
		
		 if (reverse_string.equals(reverse)) //jag testar om reverse och den omvända str(reverse_string) är lika
		 { System.out.print("Det är ett palindrom!"); } //Om de är lika skrivs detta meddelande ut
		 else System.out.print("Det är inte ett palindrom!"); //Om de inte är lika skrivs detta meddelande ut
		 
		
	
	}

	

}
