package Java1.el222ja_lab2;

import java.util.Scanner;

public class StorstaK {

	public static void main(String[] args) {
		// L�ser in ett heltal
		Scanner scan = new Scanner(System.in);
		System.out.print("Ange ett positivt heltal: ");
		int tal = scan.nextInt();
		scan.close();

		// Skapar variabler och r�knar ut K f�r olika v�rden
		int K = 0, sum = 0; 
		while (sum <= tal) { 
			K = (K+2);
			sum = sum+K; 
		}
		K=(K-2);

		//Skriver ut resultatet
		System.out.print("St�rsta tal s� att 0+2+4+6+...+K <"+tal+" K:"+K); 

	}

}
