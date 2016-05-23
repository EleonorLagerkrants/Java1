package Java1.el222ja_lab2;

import java.util.Random;
import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {
		Random rand = new Random(); 
		Scanner scan = new Scanner(System.in);
		
		//Ett slumptal mellan 1-100 väljs 
		int number = rand.nextInt(100)+1;
		
		// En while sats som avgör om gissningen är korrekt annars får man ett par chanser till
		int guessnr = 0;
		while (guessnr!=number) {
			guessnr++;
			System.out.print("Gissning"+guessnr+":");
			int guess = scan.nextInt(); 
			if (guess==number) {
		
				// Om man gissar rätt kommer följande meddelande, annars talar programmet om att talet är högre eller lägre
				System.out.print("Rätt svar efter "+guessnr+" gissningar. Grattis!");
				break; }
			else if (guess<number)
				System.out.println("Högre");
			else if (guess>number)
				System.out.println("Lägre");
			if (guessnr>9) {
				
				// Efter 10 misslyckade försök kommer detta meddelande
				System.out.print("Du misslyckades 10 gånger!"); 
				break;}
			
		
		
		}	
		
		scan.close();
		
		

		}

	}
