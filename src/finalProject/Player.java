package finalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
//Fields
	private List<Card> hand = new ArrayList<>();
	private int score = (0);
	private String name ="";
	
//Methods
	public Player (String name) {
		this.name = name; 
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
		
	}

	public void incrementScore() {
		score += 1;
	}
	 public Card flip() {
			return hand.remove(0);
			
		 }
// Getters/setters
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
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