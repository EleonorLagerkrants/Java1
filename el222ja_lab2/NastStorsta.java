package Java1.el222ja_lab2;

import java.util.Scanner;

public class NastStorsta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Skriv in tio heltal: ");
		
		int seclarge = Integer.MIN_VALUE; //Variabel för näst största 
		int large = Integer.MIN_VALUE; //Variabel för största
		
		//Läser in varje tal och testar om det är större än det största eller större än det näst största
		for (int g=0; g<10; g++){
			int number = scan.nextInt();
			if (number>large) { 
				seclarge=large;
				large=number;  }
			else if (number>seclarge) 
				seclarge=number; 
	}
		//Skriver ut det tal som är näststörst när alla tal har testats
	System.out.print("Näst största talet: "+seclarge);	
	scan.close(); 

		}}
