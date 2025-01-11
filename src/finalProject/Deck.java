package finalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Deck {

	List<Card> cards = new ArrayList<Card>();

	Deck() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"}; 
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King", "Ace"};
		
			for (String suit : suits) {
				int count = 2;
				for (String number : numbers) {
					Card card = new Card(number, suit, count);
					this.cards.add(card);
					count++;
				}
		}
	}
	
	//Getters/Setters

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	//Method	
		public void decsribe() {
			for (Card card : this.cards) {
				card.describe();
			}
		}
		
		public void shuffle() {
			Collections.shuffle(this.cards);
		}
		
		public Card draw() {
			Card card = this.cards.remove(0);
			return card;
			
		}
	}
