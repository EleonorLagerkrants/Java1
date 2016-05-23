package Java1.el222ja_lab1;

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Avstand {

	public static void main(String[] args) {
		
		//Läser in text och skapar variabler
		Scanner scan = new Scanner(System.in);
		System.out.print("Ange den första x koordinaten: ");
		double x1 = scan.nextDouble(); 
		System.out.print("Ange den första y koordinaten: ");
		double y1 = scan.nextDouble();
		System.out.print("Ange den andra x koordinaten: ");
		double x2 = scan.nextDouble();
		System.out.print("Ange den andra y koordinaten: ");
		double y2 = scan.nextDouble();
		scan.close();
		
		//Gör uträkningar
		double x12 = (x1-x2);
		double y12 = (y1-y2);
		double x = Math.pow(x12,2);
		double y = Math.pow(y12,2);
		double formel = Math.sqrt(x+y);
		DecimalFormat dFormat = new DecimalFormat("0.###"); 
		String avstand = dFormat.format(formel); 
		
		//Skriver ut resultat
		System.out.print("Avstånd: "+avstand);
		
		
		 
		
		
			
		

	}

}
