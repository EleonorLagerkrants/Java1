package Java1.el222ja_lab2;

import java.util.Scanner;
import java.util.ArrayList; 

public class OmvandOrdning {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int nrpositive = 0; //Variabel för antal positiva tal
		int tal = 0; //Variabel för talet som läses in
		ArrayList <Integer> lista = new ArrayList<Integer>();  
		System.out.println("Mata in positiva heltal. Avsluta med ett negativt.");
		while (tal>=0) //Så länge talet som matas in är positivt följer programmet de följande sakerna men om talet är negativt avslutas while-loopen
		{ 
			nrpositive++; //Antal positiva tal ökar för varje tal som läses in
			System.out.print("Tal"+nrpositive+": ");
			tal = (scan.nextInt()); 
			lista.add(tal); //Talet som läses in läggs till i arrayen
		}
		System.out.println("Antal positiva: "+(nrpositive-1)); //Antal tal minus det negativa
		System.out.print("Baklänges:");
		for (int i=(lista.size())-1; i>0; i--) {	
			System.out.print(" "+lista.get(i-1));
		}
		
		scan.close();
			}
			
			 
		
		
				
			
			
		
		}
		
	
	
	

		

	


