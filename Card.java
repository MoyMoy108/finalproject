package FinalProject;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
//import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;


public class Card {
	//private variables
	private int suit;
	private int rank;
	private int value;
	Image img;
	private String[] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
	private String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
	//	ArrayList<Image> clubs = new ArrayList<Image>();
	//	ArrayList<Image> diamonds = new ArrayList<Image>();
	//	ArrayList<Image> hearts = new ArrayList<Image>();
	//	ArrayList<Image> spades = new ArrayList<Image>();

	BufferedImage brd =null;

	//constructor for cards
	Card(int suit, int values) throws IOException  {
		this.rank = values;
		this.suit = suit;
		this.img =	this.MyImage();
	
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



	public Image  MyImage() throws IOException{
		//Construct the fully qualified path to filename
		String path = System.getProperty("user.dir");
		path += File.separator + "Files" + File.separator;
		String S = "";
		if(suit==1) 
		{
			S ="C" + rank;
		}
		else if(suit ==2)
		{
			S ="D" +rank;
		}
		else if(suit ==3)
		{
			S = "H" +rank;
		}
		else if(suit ==4)
		{
			S = "S" + rank;
		}

		path += S;
		Image brd = null;
		try {

			File file = new File(path);	


			brd = ImageIO.read(file) ;
		} catch (FileNotFoundException e) {

			// TODO Auto-generated catch block
			System.out.println("File not Found " + path);
		}
		return brd;

	}

}
