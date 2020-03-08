package FinalProject;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BlackJack extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		BlackJack black_jack = new BlackJack();
		StartScreen start_screen = new StartScreen();
		black_jack.setSize(500,500);
		
		JButton start_button = new JButton("Start Game");
		start_screen.add(start_button);
		start_button.setBounds(300,225,100,50);
		black_jack.add(start_screen);
	
		
		
		
		
		BlackJack black_jack2 = new BlackJack();
		
		black_jack2.setSize(500,500);
		
		
		
		
		
		//start_screen.setBackground(Color.GREEN);
		//start_screen.add(lets_play);
		black_jack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		black_jack2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		black_jack.setVisible(true);
		black_jack2.setVisible(false);
	}

}

