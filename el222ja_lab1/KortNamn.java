package Java1.el222ja_lab1;

import java.util.Scanner;

public class KortNamn {

	public static void main(String[] args) {
		
		//Läser in text och skapar variabler
		Scanner scan = new Scanner(System.in);
		System.out.print("Förnamn: ");
		String fornamn = scan.next();
		System.out.print("Efternamn: ");
		String efternamn = scan.next();
		efternamn = efternamn+"    ";
		scan.close();
		char punkt = '.';
		char space = ' '; 
		char first = fornamn.charAt(0);
		String sub = efternamn.substring(0,4);
		
		//Skriver ut text
		System.out.print("Kort namn: "+first+punkt+space+sub);
		
				
					}
					
				}
		


