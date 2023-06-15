
package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck{
	//Fields:  This class should have a list of Card field called cards 
	//		   that will hold all the cards in the deck. 
	 List<Card> cards = new ArrayList<Card>();
	
	//Constructor
	 Deck(){
		String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
		String [] names = {"Two","Three","Four","Five","Six","Seven","Eight",
						   "Nine","Ten","Jack","Queen","King","Ace" };
	
		for(String suit : suits) {
			int i = 2;
			for(String name : names) {
				String fullName = name+" of "+suit;
				Card card = new Card(fullName,i);
				//does it need the this. key word?
	 			cards.add(card);
				i++;
			}
		}
	 }
	 
	//Constructor with single cards
	 
	public void describe() {
		 for(Card card: cards) {
			 card.describe();
		 }
		
	}
	
	public int lenght() {
		int count = 0;
		for(int i = 0; i<cards.size(); i++) {
			count++;
		}
		return count;
	}
	 
	 public void shuffle() {
		 Collections.shuffle(cards);
	 }
	 
	 public Card draw() {
		 Card drawnCard = cards.remove(0);
		 return drawnCard;
	 }
	 
	 public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}


}
