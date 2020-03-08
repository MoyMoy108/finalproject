package FinalProject;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;


public class Card {
	//private variables
	private int suit;
	private int rank;
	private int value;
	private String[] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
	private String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
	ArrayList<Image> clubs = new ArrayList<Image>();
	ArrayList<Image> diamonds = new ArrayList<Image>();
	ArrayList<Image> hearts = new ArrayList<Image>();
	ArrayList<Image> spades = new ArrayList<Image>();

	BufferedImage brd =null;

	//constructor for cards
	Card(int suit, int values) throws IOException  {
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



	public Collection<? extends Image> MyImage(String filename) throws IOException{
	//Construct the fully qualified path to filename
	String path = System.getProperty("user.dir");
	path += File.separator + "Files" + File.separator;
	path += filename;

	try {

		File file = new File(path);	


		brd = ImageIO.read(file) ;
	} catch (FileNotFoundException e) {
		
		// TODO Auto-generated catch block
		System.out.println("File not Found " + path);
	}


	//read lines from the file



	//if statement to determine the suit (1,2,3,4)
	for( int i = 0; i < 13; i++ ) {
		clubs.addAll(MyImage( (i+1) + "C"+".jpg" )) ;
	}

	for( int i = 0; i < 13; i++ ) {
		
		hearts.addAll(MyImage( (i +1)+"H" + ".jpg" )) ;
	}

	for( int i = 0; i < 13; i++ ) {
		spades.addAll(MyImage( (i+1)+"S" +  ".jpg" ));
	}

	for( int i = 0; i < 13; i++ ) {
		diamonds.addAll(MyImage((i+1) + "D" + ".jpg" ));
	}
	return null;

}

}
