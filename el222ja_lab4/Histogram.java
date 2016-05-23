package Java1.el222ja_lab4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Histogram {
	//Metoden r�knar ut hur m�nga av talen som ligger mellan 1-100
	static int antal(ArrayList<Integer> heltal) {
		int total = 0;
		int n = 0;
		for(int i=0; i<heltal.size(); i++) {
			n=heltal.get(i);
			if(n>=1 && n<=100) {
				total++; }
		}
		return total;
	}
	//Metoden r�knar ut de heltal som inte ing�r i f�reg�ende metods resultat. Allts� de som �r l�gre �n 1 eller st�rre �n 100
	static int andra(ArrayList<Integer> heltal) {
		int others = 0;
		return others = heltal.size()-Histogram.antal(heltal);
	}
	//Ritar upp ett stapeldiagram med stj�rnor �ver hur m�nga tal det finns i varje 10-tal.
	static void histogram(ArrayList<Integer> heltal) {
	int[] arr = new int[10]; //Skapar en array storlek 10. Varje indexposition st�r f�r ett 10-intervall. tex 1-10,11-20 osv.
		int n = 0;
		for(int i=0; i<heltal.size(); i++) {
			n=heltal.get(i);
			if(n>=1 && n<=100) { //Om talet ligger mellan ett och 100 
				arr[(n-1)/10]++; //�kar det indexv�rde i arrayen som talet tillh�r. tex talet 8 tillh�r 1-10
			} }
		for(int m =0; m<arr.length; m++) {
			int start=m*10+1;
			int end = m*10+10;
			System.out.print(start+"-"+end+" ");
			for(int j=0; j<arr[m]; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}	
	}

	public static void main(String[] args) {
		File file = new File("C:\\Temp\\heltal.txt"); //Filen som ska l�sas
		Scanner scan;
		try {
			scan = new Scanner(file);
			ArrayList<Integer> heltal = new ArrayList<Integer>();
			while(scan.hasNextInt()){
				heltal.add(scan.nextInt()); // varje tal l�ggs till i en arraylist
			}
			scan.close();
			System.out.println("L�ser fil fr�n: "+file);
			System.out.println("Antal heltal i intervallet [1,100]: "+Histogram.antal(heltal));
			System.out.println("Antal �vriga tal:" +Histogram.andra(heltal));	
			System.out.println("Histogram");
			Histogram.histogram(heltal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
} 
