package FinalProject;

import java.util.ArrayList;

public class Gameplay {
	ArrayList<Card> dealer_hand;
	ArrayList<Card> player_hand;
	private int dealerhandvalue = 0;
	private int playerhandvalue = 0;
	private boolean playerwins;
	private boolean dealerwins;
	
	
	/*
	 * A gameplay constructor
	 */
	Gameplay(Deck deck){
		dealer_hand = new ArrayList<>();
		player_hand = new ArrayList<>();
		//dealer gets two cards according to the rules
	    for(int i = 0; i<2; i++)
	    {
	        dealer_hand.add(deck.drawCard());
	    }
	}
	
	/*
	 * function that will get the dealer to hit 
	 * adds card to dealer's hand
	 */
	public void dealerHit(Deck deck){
	    dealer_hand.add(deck.drawCard());
	    dealerhandvalue = 0;
	}
	
	/*
	 * make sure that the value is under 17 
	 * before the next hit
	 */
	public boolean dealerCanHit(){
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
	public boolean checkDealerBust( ) {
		if(dealerhandvalue>21){
			dealerwins =false;
	        return true;
	    }
	    return false;	
	}

	public boolean checkPlayerBust( ) {
		if(playerhandvalue>21){
			playerwins = false;
	        return true;
	    }
	    return false;	
	}

	public void Stay(){
		
		
	}
	

	//check if the dealer's hand is a blackjack or not
	public boolean isBlackJack(){
	    if(dealer_hand.size()==2 && dealerhandvalue==21)
	    {
	        return true;
	    }
	    return false;
	}
	
	public void takeTurn(Deck deck){
		//loops as long as their is no 
		while(dealerCanHit()){

	        dealerHit(deck);
	        if(checkDealerBust()){
	            //the users win as long as there was no bust on their end
	        	if(!checkPlayerBust()) {
	        		
	        	}
	        	
	        }
	    }
	    
	}
}
