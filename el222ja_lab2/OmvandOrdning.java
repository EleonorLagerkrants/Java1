package Java1.el222ja_lab2;

import java.util.Scanner;
import java.util.ArrayList; 

public class OmvandOrdning {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int nrpositive = 0; //Variabel f�r antal positiva tal
		int tal = 0; //Variabel f�r talet som l�ses in
		ArrayList <Integer> lista = new ArrayList<Integer>();  
		System.out.println("Mata in positiva heltal. Avsluta med ett negativt.");
		while (tal>=0) //S� l�nge talet som matas in �r positivt f�ljer programmet de f�ljande sakerna men om talet �r negativt avslutas while-loopen
		{ 
			nrpositive++; //Antal positiva tal �kar f�r varje tal som l�ses in
			System.out.print("Tal"+nrpositive+": ");
			tal = (scan.nextInt()); 
			lista.add(tal); //Talet som l�ses in l�ggs till i arrayen
		}
		System.out.println("Antal positiva: "+(nrpositive-1)); //Antal tal minus det negativa
		System.out.print("Bakl�nges:");
		for (int i=(lista.size())-1; i>0; i--) {	
			System.out.print(" "+lista.get(i-1));
		}
		
		scan.close();
			}
			
			 
		
		
				
			
			
		
		}
		
	
	
	

		

	


