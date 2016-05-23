package Java1.el222ja_lab1;

import java.util.Scanner;

public class Sekunder {

	public static void main(String[] args) {
		//Läser in text och skapar variabler
		Scanner scan = new Scanner(System.in);
		System.out.print("Timmar:");
		int timmar = scan.nextInt();
		System.out.print("Minuter:");
		int minuter = scan.nextInt();
		System.out.print("Sekunder:");
		int sekunder = scan.nextInt();
		scan.close();
		//Skriver ut text
		System.out.print("Totalt antal sekunder: ");
		System.out.print((timmar*3600)+(minuter*60)+(sekunder)); 
		
	
	
		

	} 

}
