package Java1.el222ja_lab1;

import java.util.Scanner;

public class VaxelPengar {

	public static void main(String[] args) {
		
		//Läser in text och skapar variabler
		Scanner scan = new Scanner(System.in);
		System.out.print("Ange kostnaden: ");
		double belopp = scan.nextDouble();
		System.out.print("Erhållen summa: ");
		double betalning = scan.nextDouble();
		scan.close();
		double tillbaka = (betalning-belopp);
		int Vaxel = (int)(tillbaka+0.5);
		System.out.print("Tillbaka: ");
		System.out.println(Vaxel +"kr");
		
		//Räknar ut hur mycket av varje valör som ska ges tillbaka
		int Tusen = (Vaxel)/1000;
		int Femhundra = ((Vaxel)/500)-(Tusen*2);
		int Hundra = (Vaxel/100)-(Femhundra*5)-(Tusen*10);
		int Femtio = (Vaxel/50)-(Hundra*2)-(Femhundra*10)-(Tusen*20);
		double tjugo = (Vaxel/20)-(Femtio*2.5)-(Hundra*5)-(Femhundra*25)-(Tusen*50);
		int Tjugo = (int)(tjugo+0);
		int Tio = (Vaxel/10)-(Tjugo*2)-(Femtio*5)-(Hundra*10)-(Femhundra*50)-(Tusen*100);
		int Fem = (Vaxel/5)-(Tio*2)-(Tjugo*4)-(Femtio*10)-(Hundra*20)-(Femhundra*100)-(Tusen*200);
		int Ett = (Vaxel/1)-(Fem*5)-(Tio*10)-(Tjugo*20)-(Femtio*50)-(Hundra*100)-(Femhundra*500)-(Tusen*1000);
		
		//Skriver ut resultatet
		System.out.println("1000-lappar: " +Tusen); 
		System.out.println("500-lappar: " +Femhundra);
		System.out.println("100-lappar: " +Hundra);
		System.out.println("50-lappar: " +Femtio);
		System.out.println("20-lappar: " +Tjugo);
		System.out.println("10-kronor: "+Tio);
		System.out.println("5-kronor: "+Fem);
		System.out.println("1-kronor: "+Ett);
		
		

	}

}
