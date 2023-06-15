package week06;

import java.util.ArrayList;
import java.util.List;

	public class Player {
		//Fields
		List<Card> hand = new ArrayList<Card>();
		
		int score;
		String name;
		
		//Methods
		public void describe(){
			System.out.println("          "+name+"'s Hand");
			System.out.println(">>>>>>>>>>>>>>>>>   <<<<<<<<<<<<<<<<<\n");
			for(Card card: hand) {
				card.describe();
			}
		}
		
		public Card flip() {
			return hand.remove(0);
		}
		public void draw(Deck deck) {
			 hand.add(deck.draw());
		}
		public int incrementScore() {
				score++;
			return score;
		}
		
		//Constructor
		public Player(String name) {
			score = 0;
			this.name = name;
		}
		
		//Getters and Setters
		public List<Card> getHand() {
			return hand;
		}

		public void setHand(Card card) {
			hand.add(card);
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
		
		
}