package Java1.el222ja_lab3;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> deck;
	
	public Deck() {
		this.deck= new ArrayList<Card>();
		for(Card.Rank rank: Card.Rank.values()) {
			for(Card.Suit suit: Card.Suit.values()) {
				Card card = new Card(rank,suit);
				this.deck.add(card);  
			}
			} 
		}
	
	public void shuffle() {	
		if(deck.size()==52) {
		Collections.shuffle(deck); }
		else throw new RuntimeException("Kortleken består inte av 52 kort");
	}
	
	public String toString() {
		String str = "";
		for(Card s: deck) {
			str = str+" "+s+"\n"; }
		return str;
	}
	
	public Card drawFromDeck() {
		return deck.remove(deck.size()-1);
	}
	public int getCardsLeft() {
		return deck.size();
	}
}

		
	