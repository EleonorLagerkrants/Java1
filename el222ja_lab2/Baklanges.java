package Java1.el222ja_lab2;

import java.util.Scanner;

public class Baklanges {

	public static void main(String[] args) {

		//Läser in text
		Scanner scan = new Scanner(System.in);
		System.out.print("Skriv en textrad: ");
		String text = scan.nextLine();
		scan.close();
		
		//Kastar om ordning på bokstäverna
		int i = text.length()-1;
		while (i > -1)
		{
			System.out.print((text.charAt(i)));
			i--;
		}



	}

}
