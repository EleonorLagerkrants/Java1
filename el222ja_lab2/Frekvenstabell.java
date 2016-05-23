package Java1.el222ja_lab2;

import java.util.Random;

public class Frekvenstabell {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[7]; //En array med plats för 7 heltal
		for (int i=0; i<6000; i++) { //En for-loop som ska simulera ett tärningskast 6000 gånger
			int dice = rand.nextInt(6)+1; //Ett tal mellan 1-6 väljs slumpmässigt 
			//Beroende på vilken siffra som väljs ökar en av arrayens variabler i värde
			if (dice==1){
				array[1]++;
			}
			else if (dice==2)
				array[2]++;
			else if (dice==3)
				array[3]++;
			else if (dice==4)
				array[4]++;
			else if (dice==5)
				array[5]++;
			else if (dice==6)
				array[6]++;
		}
		System.out.println("Frequencies when rolling a dice 6000 times"); //Resultatet skrivs ut
		System.out.println("1: "+array[1]);
		System.out.println("2: "+array[2]);
		System.out.println("3: "+array[3]);
		System.out.println("4: "+array[4]);
		System.out.println("5: "+array[5]);
		System.out.println("6: "+array[6]);
	}
}
