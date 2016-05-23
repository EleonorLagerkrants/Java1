package Java1.el222ja_lab2;

import java.util.Random;
import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {
		Random rand = new Random(); 
		Scanner scan = new Scanner(System.in);
		
		//Ett slumptal mellan 1-100 v�ljs 
		int number = rand.nextInt(100)+1;
		
		// En while sats som avg�r om gissningen �r korrekt annars f�r man ett par chanser till
		int guessnr = 0;
		while (guessnr!=number) {
			guessnr++;
			System.out.print("Gissning"+guessnr+":");
			int guess = scan.nextInt(); 
			if (guess==number) {
		
				// Om man gissar r�tt kommer f�ljande meddelande, annars talar programmet om att talet �r h�gre eller l�gre
				System.out.print("R�tt svar efter "+guessnr+" gissningar. Grattis!");
				break; }
			else if (guess<number)
				System.out.println("H�gre");
			else if (guess>number)
				System.out.println("L�gre");
			if (guessnr>9) {
				
				// Efter 10 misslyckade f�rs�k kommer detta meddelande
				System.out.print("Du misslyckades 10 g�nger!"); 
				break;}
			
		
		
		}	
		
		scan.close();
		
		

		}

	}
