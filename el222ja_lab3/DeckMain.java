package Java1.el222ja_lab3;

public class DeckMain {

	public static void main(String[] args) {
		Deck d1 = new Deck(); 
		
		d1.shuffle();
		
		for(int i=0; i<2; i++) { 
			Card card = d1.drawFromDeck(); 
			System.out.println(card+"\n");  
		}
		System.out.println("Kort kvar:"+d1.getCardsLeft());
		d1.shuffle();
	}	
	

}
