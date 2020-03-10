package FinalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Gameplay {
	//declaring class level variables
	//card related variables
	
	ArrayList<Card> dealer_hand;
	ArrayList<Card> player_hand;
	Card[] dealer_cards;
	Card[] player_cards;
	//value variables
	private int dealerhandvalue = 0;
	private int playerhandvalue = 0;
	//money variables
	public double betamount;
	private double playermoney;
	//win conditions variables
	private String winner;
	FinalGame finalgame;
	Deck deck;
	
	public int player_card_display_counter = 0;
	public int dealer_card_display_counter = 0;

	/*
	 * A game play constructor
	 */
	
	Gameplay(Deck deck, FinalGame finalgame){
		this.finalgame = finalgame;
		this.deck = deck;
		deck.shuffle();
		playermoney =1000;
		dealer_hand = new ArrayList<>();
		player_hand = new ArrayList<>();
		
		//dealer gets two cards to start according to the rules
		for(int i = 0; i<2; i++)
		{	
			Card c = deck.drawCard();
			System.out.println("Dealer " + c);
			dealer_hand.add(c);
			if (i == 0) {
				finalgame.setPanel1(c);
			}
			else if (i ==1) {
			finalgame.setPanel2(c);
			}
		}
		
		//gives the player one card to start with
		Card p = deck.drawCard();
		finalgame.setPanel8(p);
		System.out.println("Player " + p);
		player_hand.add(p);
		
		//converts the array lists into arrays
		dealer_cards =  dealer_hand.toArray(new Card[0]);
		player_cards = player_hand.toArray(new Card[0]);
		
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

	//PLAYER STUFF
	
	
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
			Card c = deck.drawCard();
			System.out.println("Player Hit: " + c);
			player_hand.add(c);
			player_cards = player_hand.toArray(new Card[0]);
			player_card_display_counter++;
			
			
			if(player_card_display_counter == 1){
				finalgame.setPanel9(c);
			}
			else if(player_card_display_counter ==2) {
				finalgame.setPanel10(c);
			}
			else if(player_card_display_counter ==3) {
				finalgame.setPanel11(c);
			}
			else if(player_card_display_counter ==4) {
				finalgame.setPanel12(c);
			}
			else if(player_card_display_counter ==5) {
				finalgame.setPanel13(c);
			}
			else if(player_card_display_counter ==6) {
				finalgame.setPanel14(c);
			}
			else {}
			
			
			for(int i = 0; i< player_cards.length; i++)
			{
				playerhandvalue += player_cards[i].getValue();
			}

		}
		else if(checkPlayerBust())
		{
			//find a way to tell user that they can no longer play that hand 
			System.out.println("You have gone over and can no longer hit");
			String set = "You have gone over -Dealer wins";
			finalgame.setS(set);
			finalgame.addMessage();
		}
		else if(playerBlackJack())
		{
			//find a way to tell user that they can no longer play that hand due to victory
			System.out.println("You have gotten 21 and can no longer hit");
			String set = "You have gotten 21 and can no longer hit";
			finalgame.setS(set);
			finalgame.addMessage();
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
	 * Player plays
	 */
	public void playerrun(Deck deck) {
		while(playerCanHit()) {
			playerHit(deck);
		}
	}
	

	/*
	 * gets the player's money
	 */
	public double getplayermoney() {
		return playermoney;
	}

	public ArrayList<Card> getPlayerHand(){
		return player_hand;
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
			//pop up possibly
			System.out.println("That's money you don't have");
			String set = "That's money you don't have";
			finalgame.setS(set);
			finalgame.addMessage();

		}
		betamount = currentbet;
		playermoney -= betamount; 
	}

	
	/*
	 * check what the amount is for bet
	 */
	public double getBet() {
		return betamount;
	}

	//DEALER STUFF
	
	/*
	 * function that will get the dealer to hit 
	 * adds card to dealer's hand
	 * calculates what their current hand is worth
	 */
	public void dealerHit(Deck deck)
	{
		dealerhandvalue = 0;
		Card d = deck.drawCard();
		System.out.println("dealer gets: " + d);
		dealer_hand.add(d);
		dealer_cards = dealer_hand.toArray(new Card[0]);
		dealer_card_display_counter++;
		if(dealer_card_display_counter == 1){
			finalgame.setPanel3(d);
		}
		else if(dealer_card_display_counter ==2) {
			finalgame.setPanel4(d);
		}
		else if(dealer_card_display_counter ==3) {
			finalgame.setPanel5(d);
		}
		else if(dealer_card_display_counter ==4) {
			finalgame.setPanel6(d);
		}
		else if(dealer_card_display_counter ==5) {
			finalgame.setPanel7(d);
		}
		else {}		
		
		for(int i = 0; i< dealer_cards.length; i++)
		{
			dealerhandvalue += dealer_cards[i].getValue();
		}
		this.checkDealerBust();
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
	 * return true/false based on whether the hand is a bust
	 * 	by seeing if the value is over 21
	 */
	public boolean checkDealerBust( ) 
	{
		if(dealerhandvalue>21){
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
	 * after both can no longer or one of the two has won
	 */
	public void winStatus() 
	{
		//player has blackjack and dealer doesn't but doesn't bust
		if(playerBlackJack() &&  dealerhandvalue < 21) 
		{
			winner = "Player wins";
			String set = winner;
			finalgame.setS(set);
			finalgame.addMessage();
			playermoney += (2.5 * betamount);
		}
		
		//if both people have blackjacks, these is a draw and the bet gets returned 
		else if(playerBlackJack() && dealerBlackJack()) 
		{
			winner = "Draw";
			String set = winner;
			finalgame.setS(set);
			finalgame.addMessage();
			playermoney += betamount;
		}
		
		//dealer has blackjack and player doesn't bust but doesn't have blackjack player doesn't gain any money 
		else if(playerhandvalue < 21 && dealerBlackJack()) 
		{
			winner = "Dealer wins";
			String set = winner;
			finalgame.setS(set);
			finalgame.addMessage();

		}
		
		//amount that is won is equivalent to twice the original amount
		else if(playerhandvalue <=21 && dealerhandvalue < playerhandvalue)
		{
			winner = "Player wins";
			String set = winner;
			finalgame.setS(set);
			finalgame.addMessage();
			playermoney += 2 * betamount;
		} 

		//dealer's hand is closer to 21 than the player without going over
		else if(playerhandvalue <21 && dealerhandvalue <=21 && dealerhandvalue > playerhandvalue)
		{
			winner = "Dealer wins";
			String set = winner;
			finalgame.setS(set);
			finalgame.addMessage();
		}
		
		//if player doesn't bust and dealer busts
		else if(playerhandvalue <=21 && checkDealerBust())
		{
			winner = "Player wins";
			String set = winner;
			finalgame.setS(set);
			finalgame.addMessage();
		}
		
		//if player gets blackJack and dealer busts
		else if(playerBlackJack() && checkDealerBust())
		{
			winner = "Dealer Busts, and Player wins";
			String set = winner;
			finalgame.setS(set);
			finalgame.addMessage();
		}
		
		//if player gets blackJack and dealer busts
		else if(playerBlackJack() && checkDealerBust())
		{
			winner = "Dealer Busts, and Player wins";
			String set = winner;
			finalgame.setS(set);
			finalgame.addMessage();
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
			}
		}
		
		//if player already busted then victory goes to the dealer right away
		else if( checkPlayerBust()==true)
		{
			//dealer wins automatically
			//			System.out.println("Dealer wins");
			//			String set = "Dealer Wins";
			//			finalgame.setS(set);
			//			finalgame.addMessage();
		}
	}
}


