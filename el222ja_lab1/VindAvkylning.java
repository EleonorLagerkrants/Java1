package Java1.el222ja_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VindAvkylning {

	public static void main(String[] args) {
		
		//Läser in och skapar variabler
		Scanner scan = new Scanner(System.in);
		System.out.print("Ange temperaturen: ");
		double T = scan.nextDouble();
		System.out.print("Ange vindhastigheten: ");
		double V = scan.nextDouble();
		scan.close();
		double v = Math.pow(V,0.16);
		
		//Gör uträkningar
		double eff_temp = 13.126667+0.6215*T-13.924748*v+0.4875195*T*v; //Bluesteins formel
		double eff = Math.round(eff_temp);
		DecimalFormat df = new DecimalFormat("#.#");
		String effektiv = df.format(eff);
		
		//Skriver ut resultat
		System.out.print("Effektiv temperatur: "+effektiv+" grader Celsius");
		
	}

}