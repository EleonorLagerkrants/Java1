package Java1.el222ja_lab1;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		//Läser in text och skapar variabler
		Scanner scan = new Scanner(System.in);
		System.out.print("Din längd i meter:");
		double längd = scan.nextDouble();
		System.out.print("Din vikt i kg:");
		int vikt = scan.nextInt();
		scan.close();
		double BMI = (vikt/(längd*längd));
		int klar = (int)(BMI+0.5);  
		
		//Skriver ut text
		System.out.print("Ditt BMI:");
		System.out.print(klar); 
	

	}

}
