package compare;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		CardGame i = new CardGame();
		i.getCards();
		i.shuffleCards();
		i.deal();
		i.compareCard();
		
		int count= 0;
		
		
		// List<Card> a = i.getCardList();
		// for (int j = 0; j < a.size(); j++) {
		// 	System.out.println(a.get(j).getSuit() + a.get(j).getValue());
		// 	count++;
		// }
		// System.err.println(count);
		
		count = 0;
		List<Card> p1 = i.getPlayer1CardList();
		for (int j = 0; j < p1.size(); j++) {
			System.out.println(p1.get(j).getSuit() + p1.get(j).getValue());
			count++;
		}
		System.err.println("player1 card:" + count);
		
		count = 0;
		List<Card> p2 = i.getPlayer2CardList();
		for (int j = 0; j < p2.size(); j++) {
			System.out.println(p2.get(j).getSuit() + p2.get(j).getValue());
			count++;
		}
		System.err.println("player2 card:" + count);
		
		count = 0;
		List<Card> table = i.getTableCardList();
		for (int j = 0; j < table.size(); j++) {
			System.out.println(table.get(j).getSuit() + table.get(j).getValue());
			count++;
		}
		System.err.println("table card:" + count);
	}

}
