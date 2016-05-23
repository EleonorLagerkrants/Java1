package Java1.el222ja_lab4.sorter_orter;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class SorteraOrter {

	public static void main(String[] args) {
		File file = new File("C:\\Temp\\SorteraOrter.txt");
		try { 
			Scanner scan = new Scanner(file);
			ArrayList<Ort> arr = new ArrayList<Ort>();
			int postnummer = 0;
			String str = "";
			char c = ';';
			String ortnamn = "";
			int index = 0;
			while(scan.hasNextLine()) {
				str = scan.nextLine();
				if((index = str.indexOf(c))!=-1) {
					postnummer = Integer.parseInt(str.substring(0,index).trim());
					ortnamn = str.substring(index+1).trim();
					arr.add(new Ort(postnummer,ortnamn));
				}

			}
			scan.close();
			System.out.println("Läser orter från filen: "+file);
			System.out.println("Antal funna orter: "+arr.size()); 
			Collections.sort(arr);
			Iterator<Ort> i = arr.iterator();
			while(i.hasNext()) {
				Ort o = i.next();
				System.out.println(o);
			}




		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	} }
