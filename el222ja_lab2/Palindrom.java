package Java1.el222ja_lab2;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Palindrom {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder(""); //Skapar en tom Stringbuilder
		Scanner scan = new Scanner(System.in);
		System.out.print("Skriv en textrad: ");
		String text = (scan.nextLine()); 
		text = text.toLowerCase(); //G�r den inl�sta texten till sm� bokst�ver
		scan.close();
		
		for (int i=0; i<text.length(); i++) {
		 char c = text.charAt(i); 
		 if (Character.isLetter(c)) { //Kontrollerar varje tecken i str�ngen f�r att se om de �r bokst�ver
			 str.append(c); //Om de �r bokst�ver l�ggs de till i den tomma StringBuildern str
		 }
		}
		 String reverse= str.toString(); // Jag g�r str till en vanlig string(reverse)
		 str = str.reverse(); 
		 String reverse_string = str.toString(); //jag g�r �ven str omv�nd till en string
		
		 if (reverse_string.equals(reverse)) //jag testar om reverse och den omv�nda str(reverse_string) �r lika
		 { System.out.print("Det �r ett palindrom!"); } //Om de �r lika skrivs detta meddelande ut
		 else System.out.print("Det �r inte ett palindrom!"); //Om de inte �r lika skrivs detta meddelande ut
		 
		
	
	}

	

}
