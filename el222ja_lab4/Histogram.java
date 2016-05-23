package Java1.el222ja_lab4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Histogram {
	//Metoden räknar ut hur många av talen som ligger mellan 1-100
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
	//Metoden räknar ut de heltal som inte ingår i föregående metods resultat. Alltså de som är lägre än 1 eller större än 100
	static int andra(ArrayList<Integer> heltal) {
		int others = 0;
		return others = heltal.size()-Histogram.antal(heltal);
	}
	//Ritar upp ett stapeldiagram med stjärnor över hur många tal det finns i varje 10-tal.
	static void histogram(ArrayList<Integer> heltal) {
	int[] arr = new int[10]; //Skapar en array storlek 10. Varje indexposition står för ett 10-intervall. tex 1-10,11-20 osv.
		int n = 0;
		for(int i=0; i<heltal.size(); i++) {
			n=heltal.get(i);
			if(n>=1 && n<=100) { //Om talet ligger mellan ett och 100 
				arr[(n-1)/10]++; //ökar det indexvärde i arrayen som talet tillhör. tex talet 8 tillhör 1-10
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
		File file = new File("C:\\Temp\\heltal.txt"); //Filen som ska läsas
		Scanner scan;
		try {
			scan = new Scanner(file);
			ArrayList<Integer> heltal = new ArrayList<Integer>();
			while(scan.hasNextInt()){
				heltal.add(scan.nextInt()); // varje tal läggs till i en arraylist
			}
			scan.close();
			System.out.println("Läser fil från: "+file);
			System.out.println("Antal heltal i intervallet [1,100]: "+Histogram.antal(heltal));
			System.out.println("Antal övriga tal:" +Histogram.andra(heltal));	
			System.out.println("Histogram");
			Histogram.histogram(heltal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
} 
