package Java1.el222ja_lab1;

import java.util.Random;

public class TelefonNummer {

	public static void main(String[] args) {
		Random rand = new Random();
		
		//Skriver ut text
		System.out.print("0");
		System.out.print(rand.nextInt(10));
		System.out.print(rand.nextInt(10));
		System.out.print(rand.nextInt(10));
		System.out.print("-");
		System.out.print(rand.nextInt(9)+1);
		System.out.print(rand.nextInt(10));
		System.out.print(rand.nextInt(10));
		System.out.print(rand.nextInt(10));
		System.out.print(rand.nextInt(10));
		System.out.print(rand.nextInt(10));
		

	}

}
