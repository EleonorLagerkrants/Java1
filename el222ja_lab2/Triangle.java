package Java1.el222ja_lab2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		//L�ser in ett udda tal
		Scanner scan = new Scanner(System.in);
		System.out.print("Ange ett udda heltal: "); 
		int udda = scan.nextInt(); //Det udda tal som matas in
		scan.close();
		String c = ("*");
		String s = (" ");
		
		//Felmeddelande om ett j�mnt tal skrivs in och programmet avslutas 
		if (udda%2==0) { 
			System.out.print("Fel. Du angav ett j�mnt nummer");
			return; }
		
		//Den r�tvinkliga triangeln ritas upp. for-satsen r�knar ut hur m�nga stj�rnor resp. mellanslag som ska finnas p� varje rad
		System.out.println("R�tvinklig triangel: ");
		for (int i=1; i<=udda; i++){

		String h = ""; 
			for (int mellanslag=udda-i; mellanslag>0; mellanslag--){
				h=h+s; } //Fyller den tomma stringen h med de mellanslag som ska vara med
			for (int stars=i; stars>0; stars--){
				h=h+c; //Fyller den tomma stringen h med de stj�rnor som ska vara med
			}
			System.out.print(h);
			h=""; //T�mmer h efter varje rad
			System.out.print("\n");
			
		}
		//Den likbenta triangeln ritas upp, samma metod som tidigare men h�r beh�vs bara mellanslagen p� triangelns ena sida best�mmas
		String space = "";
		System.out.print("\n");
		System.out.println("Likbent triangel: ");
		for (int j=1; j<=udda; j=j+2) { //antalet stj�rnor �kar med 2 varje rad
			String h = "";
			int g = (udda-j)/2; //det inmatade numret minus antalet stj�rnor delat p� tv� 
			for (int stars=j; stars>0; stars--){
				h=h+c; }
			for (int mellanslag=g; mellanslag>0; mellanslag--){
				space=space+s; 
			}
			System.out.print(space+h);
			h="";
			space=""; 
			System.out.print("\n");
			}
		}
		
	
		
			}
		
	

	





