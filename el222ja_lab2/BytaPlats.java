package Java1.el222ja_lab2;

public class BytaPlats {

	public static void main(String[] args) {
		
		//Den array som ska skrivas ut
		char[] text = {'t', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 't', 't', 'e', 'D'};
		System.out.println(text);
		 //Skapar variabler för for-loopen
		int i=0, j=text.length;
		for (i=0; i<text.length/2; i++, j--) { //Bara hälften av chars behöver byta plats
			char temp = text[i]; //Sparar temporärt char så att de kan byta plats
			text[i] = text[j-1];
			text[j-1] = temp;
		}
				
		System.out.print(text);
		
	}
	}

