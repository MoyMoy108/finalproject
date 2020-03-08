package FinalProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComponentScreen extends JComponent implements ActionListener{
	
	JFrame frame = new JFrame();
	Boolean hit_button = false;
	Boolean stay_button = false;
	
	Rectangle yourcards_rect = new Rectangle(100, 400, 200, 20);

	public void display() {

		this.addFrame();
		
		
		
	}



	public void addFrame() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 1000, 1000);
		frame.setBackground(Color.GREEN);
		frame.setResizable(false);
		this.addHitButton();
		this.addStayButton();
		this.addYouLabel();
		this.addDealerLabel();

		frame.setVisible(true);
	}


	public void addHitButton() {
		JButton hit_button = new JButton("HIT!");  
		hit_button.setBounds(100, 450, 100, 100);
		hit_button.setBackground(Color.GRAY);
		frame.add(hit_button);

		hit_button.addActionListener(this);
	}
	
	public void addStayButton() {
		JButton stay_button = new JButton("STAY!");  
		stay_button.setBounds(200, 450, 100, 100);
		stay_button.setBackground(Color.GRAY);
		frame.add(stay_button);
		

		stay_button.addActionListener(this);
	}


	public void addYouLabel() {
		JLabel your_cards = new JLabel("YOUR CARDS");
		your_cards.setBounds(100, 400, 200, 20);
		
		your_cards.setBackground(Color.red);
		frame.add(your_cards);
	}
	
	public void addDealerLabel() {
		JLabel dealer = new JLabel("DEALER");
		Rectangle dealer_rect = new Rectangle(100, 25, 200, 20);
		dealer.setBounds(dealer_rect);
		//dealer_rect.(Color.red);
		frame.add(dealer);
	}

	@Override
	public void actionPerformed(ActionEvent e2) {
		// TODO Auto-generated method stub

	}
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(yourcards_rect);
		g2.setColor(Color.RED);
		g2.fill(yourcards_rect);
		g2.drawString("Please choose an empty square // See console for winner", 100, 450);
	}

}

