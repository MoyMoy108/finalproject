package FinalProject;

import java.util.ArrayList;
import java.util.Random;

public class Deck throws IOException {

	private ArrayList<Card> deck;
	/*
	 * Constructs a new arrayList deck and 
	 * use for loop to fill it up
	 */

	Deck(){
		deck = new ArrayList<Card>();
		for(int i=0; i<4; i++)
		{
			for(int j=1; j<=13; j++)
			{
				deck.add(new Card(i,j));
			}
		}
	}

	/*
	 * Method to shuffle cards by 
	 * doing something....
	 */
	public void shuffle()
	{
		Random random = new Random();
		Card temp;
		for(int i=0; i<100; i++)
		{
			int index1 = random.nextInt(deck.size()-1);
			int index2 = random.nextInt(deck.size()-1);
			temp = deck.get(index2);
			deck.set(index2, deck.get(index1));
			deck.set(index1, temp);
		}
	}


	/*
	 *method to draw cards and then making 
	 *the deck smaller
	 */
	public Card drawCard(){
		return deck.remove(0);
	}

}
