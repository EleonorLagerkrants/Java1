package Java1.el222ja_lab2;

import java.util.Scanner;

public class NastStorsta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Skriv in tio heltal: ");
		
		int seclarge = Integer.MIN_VALUE; //Variabel f�r n�st st�rsta 
		int large = Integer.MIN_VALUE; //Variabel f�r st�rsta
		
		//L�ser in varje tal och testar om det �r st�rre �n det st�rsta eller st�rre �n det n�st st�rsta
		for (int g=0; g<10; g++){
			int number = scan.nextInt();
			if (number>large) { 
				seclarge=large;
				large=number;  }
			else if (number>seclarge) 
				seclarge=number; 
	}
		//Skriver ut det tal som �r n�stst�rst n�r alla tal har testats
	System.out.print("N�st st�rsta talet: "+seclarge);	
	scan.close(); 

		}}
