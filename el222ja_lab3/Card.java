package Java1.el222ja_lab3;

public class Card {
	private final Rank rank;
	private final Suit suit;
	
	public enum Rank {
		ACE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6),SEVEN(7),EIGHT(8),NINE(9),TEN(10),JACK(11),QUEEN(12),KING(13);
		
		private final int code;
		
		public int getCode() {
			return code; 
		}
		
		private Rank(int code) {
			this.code = code;
		}
		
		public static Rank valueOf(int code) {
			for (Rank rank: Rank.values()) {
				if (rank.getCode()==code)
					return rank;
			}
			throw new RuntimeException("Invalid Code"); 
		}
		
	}
	public enum Suit{
		SPADES(1),HEARTS(2),CLUBS(3),DIAMONDS(4);
		
		private final int code; 
		
		public int getCode() {
			return code;
		}
		private Suit(int code) {
			this.code=code;
		}
		public static Suit valueOf(int code) {
			for(Suit suit: Suit.values()) {
				if(suit.getCode()==code)
					return suit;
			}
			throw new RuntimeException("Invalid code"); 	
		}
	}
	public Card(Rank rank,Suit suit) {
		this.suit = suit;
		this.rank = rank;
		}
	public Rank getRank() {
		return rank;
	}
	public Suit getSuit() {
		return suit;
	}
	public String toString() {
		String str = "";
		str=str+rank+" "+suit;
		return str;
	}
}
