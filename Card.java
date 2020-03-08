package FinalProject;

import java.applet.*;
import java.awt.*;


public class Card {
	//private variables
	private int suit;
	private int rank;
	private int value;
	private String[] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
	private String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
	image clubs = new image[13];
        image hearts = new image[13];
        image spades = new image[13];
        image diamonds = new image[13];
	
	//constructor for cards
	Card(int suit, int values)
	{
	    this.rank = values;
	    this.suit = suit;
        
	}
	
	//gets the rank
	public int getRank()
	{
	    return rank;
	}
	
	//gets the suit
	public int getSuit()
	{
	    return suit;
	}

	//gets the values based on the rank of the card
	public int getValue()
	{	
		//based on blackjack facecards are worth 10
	    if(rank>10)
	    {
	        value=10;
	    }
	    //aces are worth 11
	    else if(rank==1)
	    {
	        value=11;
	    }
	    else
	    {
	        value=rank;
	    }
	    return value;
	}
	
	/*
	 * Returns the string version of a card.
	 */
	
	public String toString()
	{
	    return ranks[rank]+" of "+suits[suit];
	}
	
	//sets the value of a card
	public void setValue(int set)
	{
	    value = set;
	}
}
