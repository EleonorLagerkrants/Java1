package Java1.el222ja_lab2;

public class BytaPlats {

	public static void main(String[] args) {
		
		//Den array som ska skrivas ut
		char[] text = {'t', 't', '�', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 't', 't', 'e', 'D'};
		System.out.println(text);
		 //Skapar variabler f�r for-loopen
		int i=0, j=text.length;
		for (i=0; i<text.length/2; i++, j--) { //Bara h�lften av chars beh�ver byta plats
			char temp = text[i]; //Sparar tempor�rt char s� att de kan byta plats
			text[i] = text[j-1];
			text[j-1] = temp;
		}
				
		System.out.print(text);
		
	}
	}

