package Java1.el222ja_lab2;

import java.util.Scanner;

public class Raknasiffror {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Mata in ett heltal: ");
		String number = scan.next();
		scan.close(); 
		//Variabler för nollor, udda och jämna
		int zero = 0;
		int even = 0;
		int uneven = 0;
		
		//En for-loop där varje siffra definieras som nolla, udda eller jämn.
		for (int i=0; i<number.length(); i++) {
			char c = number.charAt(i);
			int n = c-'0';
			if (n==0) {
				zero++;
			}
			else if (n%2==0)
					even++;
			else if (n%2==1)
					uneven++;			
			}
		System.out.println("Nollor: "+zero);
		System.out.println("Jämna: "+even);
		System.out.println("Udda: "+uneven);
			
		}

	}

