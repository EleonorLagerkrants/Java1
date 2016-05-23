package Java1.el222ja_lab1;

import java.util.Scanner;

public class Citat {

	public static void main(String[] args) {
		// Läser in text
		Scanner scan = new Scanner(System.in);
		System.out.print("Skriv in en rad text:");
		String text = scan.nextLine();
		scan.close();
		//Skriver ut text
		System.out.print("Citat: ");
		System.out.print("\"");
		System.out.print(text);
		System.out.print("\"");

	}

}
