package Java1.el222ja_lab1;

import java.util.Scanner;

public class Tiden {

	public static void main(String[] args) {
		
		//Läser in text och skapar variabler
		Scanner scan = new Scanner(System.in);
		System.out.print("Ange antal sekunder:");
		int inmatade = scan.nextInt();
		scan.close();
		int timmar = (inmatade/3600);
		int minuter = ((inmatade/60)-(timmar*60));
		int sekunder = (inmatade-(timmar*3600)-(minuter*60));
		
		//Skriver ut text
		System.out.print("Detta ger:");
		System.out.print(timmar + " timmar, ");
		System.out.print(minuter + " minuter, ");
		System.out.print(sekunder +" sekunder");
		
		

	}

}
