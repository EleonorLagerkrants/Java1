package Java1.el222ja_lab1;

import java.util.Scanner;

public class SummaAvTre {

	public static void main(String[] args) {
		
		//L�ser in text och skapar variabler
		Scanner scan = new Scanner(System.in);
		System.out.print("Ange ett tresiffrigt heltal:");
		int heltal = scan.nextInt();
		scan.close();
		int f�rsta = (heltal/100);
		int andra = (heltal/10)%10;
		int tredje = (heltal%10);
		
		//Skriver ut text
		System.out.print("Summan av siffrorna blir: " +(f�rsta + andra + tredje));
		
	

	}

}
