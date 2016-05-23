package Java1.el222ja_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Konvertera {

	public static void main(String[] args) {
		
		//L�ser in text och skapar variabler
		Scanner scan = new Scanner(System.in);
		System.out.print("Ange temperatur i Fahrenheit: ");
		double temperatur = scan.nextDouble();
		scan.close();
		
		//G�r utr�kning
		double celsius = (temperatur-32)*5/9;
		DecimalFormat dFormat = new DecimalFormat("0.#");
		String en_decimal = dFormat.format(celsius);
		
		//Skriver ut resultat
		System.out.println("Temperatur i Celsius " +en_decimal);
		
		

	}

}
