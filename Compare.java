package compare;

import java.util.*;

public class Compare {
	private List<Card> cardList = new ArrayList<Card>();
	private List<Card> player1Card = new ArrayList<Card>();
	private List<Card> player2Card = new ArrayList<Card>();
	private List<Card> table = new ArrayList<Card>();

	public CardGame() {

	}

	public void getCards() {
		String[] suitType = { "H", "S", "D", "C" };
		for (int i = 0; i < 4; i++) {
			for (int j = 2; j < 15; j++) {
				cardList.add(new Card(j, suitType[i], false));
			}
		}
	}

	public void shuffleCards() {
		List<Card> randomCardList = new ArrayList<Card>();
		int order;
		int cardSize = cardList.size();
		for (int i = 0; i < cardSize; i++) {
			order = (int) (Math.random() * (cardSize - i));
			randomCardList.add(cardList.get(order));
			cardList.remove(order);
		}
		cardList = randomCardList;
	}

	public void deal() {
		for (int i = 0; i < cardList.size(); i += 2) {
			player1Card.add(cardList.get(i));
			player2Card.add(cardList.get(i + 1));
		}
	}

	public void compareCard() {
		int count = 0;
		while (player1Card.size() > 0 && player2Card.size() > 0) {
			count++;
			System.out.print(count + ":   ");
			
			String player1Suit =player1Card.get(0).getSuit();
			String player2Suit =player2Card.get(0).getSuit();
			
			int player1Value = player1Card.get(0).getValue();
			int player2Value = player2Card.get(0).getValue();
			table.add(player1Card.remove(0));
			table.add(player2Card.remove(0));
			
			if (player1Value > player2Value) {
				for (Card card : table) {
					player1Card.add(card);
				}
				table.clear();
				System.out.println("1 win   " + player1Suit + player1Value + "  " + player2Suit + player2Value);
			} else if (player1Value < player2Value) {
				for (Card card : table) {
					player2Card.add(card);
				}
				table.clear();
				System.out.println("2 win   " + player1Suit + player1Value + "  " + player2Suit + player2Value);
			} else if (player1Value == player2Value) {
				for (int i = 0; i < 3; i++) {
					System.err.print("equal  ");
					if (player1Card.size() == 0 || player2Card.size() == 0) {
						break;
					}
					table.add(player1Card.remove(0));
					table.add(player2Card.remove(0));
				}
				System.out.println();
			}
		}
		
		
	}

	public List<Card> getCardList() {
		return cardList;
	}

	public List<Card> getPlayer1CardList() {
		return player1Card;
	}

	public List<Card> getPlayer2CardList() {
		return player2Card;
	}
	public List<Card> getTableCardList() {
		return table;
	}
}
