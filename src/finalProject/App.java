package finalProject;

import java.util.ArrayList;
import java.util.List;



public class App {
	List<Card> cards = new ArrayList<Card>();

	
	//Instantiate new Deck
	public static void main(String[] args) {
		
		Deck deck = new Deck();
		deck.decsribe();
		 
		System.out.println("-----------------------");
		
		System.out.println("Welcome! Let's play the Game of War!");
		
			
	// Shuffle the deck
			deck.shuffle();
			deck.decsribe();
			
	System.out.println("--------------------------");
	// Instatianting new players
			Player player1 = new Player("June");
				
			Player player2 = new Player("July");
			
			
	
// For loop iterating 52 times
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
			
		}
		
		
//For loop  iterating 26 times
				for (int i = 0; i < 26; i++) {
					int roundNumber = i + 1; 
					System.out.println("Round " + roundNumber + ":");	
					Card p1Draw = player1.flip();
					Card p2Draw = player2.flip();
					

			 p1Draw.describe();
			 p2Draw.describe();
			 
			if (p1Draw.getValue() > p2Draw.getValue()) {
				System.out.println("Player1 wins the round!");
				player1.incrementScore();
			} else if (p2Draw.getValue() > p1Draw.getValue()) {
				System.out.println("Player2 wins the round!");
				player2.incrementScore();
			} else   {
				System.out.println("The round is a draw!");
		}	
			
							
			}
			System.out.println("--------------------------");
			System.out.println("The game of War Is over! "
					+ "Final scores: " + "Player1: " + player1.getScore() + "Player2: " + player2.getScore());
	
			if (player1.getScore() > player2.getScore()) {
				System.out.println("Player1 has won the game!");
			} else if (player2.getScore() > player1.getScore()) {
				System.out.println("Player2 has won the game!");
			} else  {
				System.out.println("The game of War is a draw!");
		}

}
}
