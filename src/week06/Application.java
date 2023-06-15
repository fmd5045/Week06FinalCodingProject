package week06;

//import java.util.*;

public class Application {

	public static void main(String[] args) {
		//Instantiate a Deck 
		Deck createdDeck = new Deck();
		
		//Instantiate two players
		Player playerOne = new Player("Player One");
		Player playerTwo = new Player("Player Two");
		
	    //Shuffle the deck
	    createdDeck.shuffle();

	    //deal cards
	    for(int i=1; i<=52; i++) {
	    	//Card drawnCard = new Card();
	    	if(i%2==0) {
	    		playerOne.draw(createdDeck);
	    		
	    	}
	    	else {
	    		playerTwo.draw(createdDeck);
	    	}
	    }
	    
	    //Comparing cards
	    for(int i=0; i<26; i++) {
	    	Card one = playerOne.flip();
	    	Card two = playerTwo.flip();
	    	if(one.getValue() > two.getValue()) {
	    		playerOne.incrementScore();
	    	}
	    	else if(one.getValue() < two.getValue()){
	    		playerTwo.incrementScore();
	    	}
	    }
	    
	    //Comparing Scores
	    System.out.println("The game is over: ");
	    System.out.println(playerOne.name+"'s Score is: "+ playerOne.score);
	    System.out.println(playerTwo.name+"'s Score is: "+ playerTwo.score);
	    System.out.print("Results: ");
	    if(playerOne.score>playerTwo.score) {
	    	System.out.println(playerOne.name+" wins!");
	    }
	    else if(playerOne.score<playerTwo.score) {
	    	System.out.println(playerTwo.name+ " wins!");
	    }
	    else {
	    	System.out.println("A Tie!");
	    }
	}
}
