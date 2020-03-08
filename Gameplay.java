package FinalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Gameplay {
	//all the variables that are going to be used
	ArrayList<Card> dealer_hand;
	ArrayList<Card> player_hand;
	Card[] dealer_cards;
	Card[] player_cards;
	private int dealerhandvalue = 0;
	private int playerhandvalue = 0;
	public int betamount;
	private int playermoney;
	private boolean playerwins;
	private boolean dealerwins;

	/*
	 * A gameplay constructor
	 */
	Gameplay(Deck deck){
		playermoney =1000;
		dealer_hand = new ArrayList<>();
		player_hand = new ArrayList<>();
		//dealer gets two cards to start according to the rules
		for(int i = 0; i<2; i++)
		{
			dealer_hand.add(deck.drawCard());
		}
		//gives the player one card to start with
		player_hand.add(deck.drawCard());
		//converts the arraylists into arrays
		dealer_cards = (Card[]) dealer_hand.toArray();
		player_cards = (Card[]) player_hand.toArray();
		//gets the current value of the dealer's hand upon starting
		for(int i = 0; i<dealer_cards.length; i++)
		{
			dealerhandvalue += dealer_cards[i].getValue();
		}
		//gets the value of the users hand upon starting
		for(int i = 0; i< player_cards.length; i++)
		{
			playerhandvalue += player_cards[i].getValue();
		}

	}

	/*
	 * way of taking a bet and finding out if it is more than
	 * current assets
	 */
	public void bet() {
		Scanner bet = new Scanner(System.in);
		int currentbet= bet.nextInt();
		if( currentbet > playermoney) {
			//inform user that that doesn't work
			System.out.println("That's money you don't have");
		}
		betamount = currentbet;
	}
	
	/*
	 * function that will get the dealer to hit 
	 * adds card to dealer's hand
	 * calculates what their current hand is worth
	 */
	public void dealerHit(Deck deck)
	{
		dealerhandvalue = 0;
		dealer_hand.add(deck.drawCard());
		dealer_cards = (Card[]) dealer_hand.toArray();
		for(int i = 0; i< dealer_cards.length; i++)
		{
			dealerhandvalue += dealer_cards[i].getValue();
		}
	}

	/*
	 * make sure that the value is under 17 
	 * before the next hit
	 */
	public boolean dealerCanHit()
	{
		if(dealerhandvalue<17)
		{
			return true;
		}
		return false;
	}

	/*
	 * allows the user to hit
	 * gives them another card
	 * calculates how much their hand is worth
	 */
	public void playerHit(Deck deck)
	{
		if (playerCanHit())
		{
			playerhandvalue = 0;
			player_hand.add(deck.drawCard());
			player_cards = (Card[]) player_hand.toArray();
			for(int i = 0; i< player_cards.length; i++)
			{
				playerhandvalue += player_cards[i].getValue();
			}
		}
		else 
		{
			//find a way to tell user that they can no longer play that hand 
		}

	}

	/*
	 * checks if player can continue hitting
	 * if below 21 then they can
	 */
	public boolean playerCanHit()
	{
		if(playerhandvalue<21)
		{
			return true;
		}
		return false;
	}

	/*
	 * states whether or not the user has decided to stay
	 */
	public boolean Stay()
	{
		return true;
	}

	/*
	 * return true/false based on whether the hand is a bust
	 * 	by seeing if the value is over 21
	 */
	public boolean checkDealerBust( ) 
	{
		if(dealerhandvalue>21){
			dealerwins =false;
			return true;
		}
		return false;	
	}

	/*
	 * checks to see if the player has lost
	 * by going over 21 
	 */
	public boolean checkPlayerBust()
	{
		if(playerhandvalue>21){
			playerwins = false;
			return true;
		}
		return false;	
	}

	/*
	 * check if the dealer's hand is a blackjack or not
	 * needs to have 2 cards and a hand value of 21
	 */
	public boolean dealerBlackJack()
	{
		if(dealer_hand.size()==2 && dealerhandvalue==21)
		{
			return true;
		}
		return false;
	}

	/*
	 * checks if the player's hand is a blackjack or not
	 */
	public boolean playerBlackJack()
	{
		if(player_hand.size()==2 && playerhandvalue==21)
		{
			return true;
		}
		return false;
	}	
	/*
	 * Checks the condition of the game and determines who has won
	 */
	public void winStatus() 
	{
		//player has blackjack and dealer doesn't
		if(playerBlackJack() && !dealerBlackJack()) 
		{
			playerwins = true;
			dealerwins = false;
		}
		//dealer has blackjack and player doesn't
		else if(!playerBlackJack() && dealerBlackJack()) 
		{
			playerwins = false;
			dealerwins = true;
		}
		else if(playerhandvalue <=21 && dealerhandvalue < playerhandvalue)
		{
			playerwins = true;
			dealerwins = false;
		}
		else if(playerhandvalue <=21 && dealerhandvalue < playerhandvalue)
		{
			playerwins = true;
			dealerwins = false;
		}
	}


	public void dealerTurn(Deck deck)
	{
		//makes sure that the player hasn't busted first before doing dealer's turn
		if(!checkPlayerBust()) 
		{
			//call a method to draw player wins
			//call a method to create a pop-up window
			//update stats(total and card counter)
			//loops as long as their is no bust 
			while(dealerCanHit()) 
			{
				dealerHit(deck);
				if(checkDealerBust())
				{
					//the users win as long as there was no bust on their end


				}
			}
		}
		//if player already busted then victory goes to the dealer right away
		else if( checkPlayerBust())
		{
			
		}

	}
}
