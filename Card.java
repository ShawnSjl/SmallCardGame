package compare;

public class Card {
	private int value;
	private String suit;
	private boolean ifTurnOver;
	
	public Card(int order, String suit, boolean ifTurnOver) {
		this.value = order;
		this.suit = suit;
		this.ifTurnOver = ifTurnOver;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public boolean ifTurnOver() {
		return ifTurnOver;
	}
}
