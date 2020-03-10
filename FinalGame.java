package FinalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.awt.Font;

public class FinalGame extends JFrame {


	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtEnterBetAmount;
	private int playing = 0;
	Deck deck = new Deck();
	Gameplay gameplay;
	FinalGame frame;
	JTextField MessageBox = new JTextField();
	JTextField current_bet;
	public String s = " ";
	JButton HitButton;
	JButton StayButton;
	
	public int counter = 0;

	//img panels
	public ImagePanel panel1 = new ImagePanel();
	public ImagePanel panel2 = new ImagePanel();
	public ImagePanel panel3 = new ImagePanel();
	public ImagePanel panel4 = new ImagePanel();
	public ImagePanel panel5 = new ImagePanel();
	public ImagePanel panel6 = new ImagePanel();
	public ImagePanel panel7 = new ImagePanel();
	public ImagePanel panel8 = new ImagePanel();
	public ImagePanel panel9 = new ImagePanel();
	public ImagePanel panel10 = new ImagePanel();
	public ImagePanel panel11 = new ImagePanel();
	public ImagePanel panel12 = new ImagePanel();
	public ImagePanel panel13 = new ImagePanel();
	public ImagePanel panel14 = new ImagePanel();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					FinalGame frame = new FinalGame();
					frame.setVisible(true);
					//playgame();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
	}

	/**
	 * Create the frame and add visual elements.
	 */
	public FinalGame() {

		setTitle("Black Jack");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 545);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);


		txtEnterBetAmount = new JTextField();
		txtEnterBetAmount.setText("Enter Bet amount");
		txtEnterBetAmount.setColumns(10);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Dealer");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(279, 11, 72, 20);
		contentPane.add(lblNewLabel);

		JLabel lblPlayer = new JLabel("Player");
		lblPlayer.setBackground(Color.LIGHT_GRAY);
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setBounds(279, 422, 72, 20);
		contentPane.add(lblPlayer);

		JLabel lblNewLabel_1 = new JLabel("Total Assets");
		lblNewLabel_1.setBounds(585, 422, 80, 14);
		contentPane.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(579, 447, 86, 20);
		contentPane.add(textField);
		textField.setText("hello");
		textField.setColumns(10);

		MessageBox.setText("Message Box");
		MessageBox.setHorizontalAlignment(SwingConstants.CENTER);
		MessageBox.setBounds(109, 447, 460, 20);
		contentPane.add(MessageBox);
		MessageBox.setColumns(10);

		JLabel current_bet_label = new JLabel("Current Bet");
		current_bet_label.setBounds(10, 422, 89, 14);
		contentPane.add(current_bet_label);

		current_bet = new JTextField();
		current_bet.setBounds(10, 447, 89, 20);
		contentPane.add(current_bet);
		current_bet.setColumns(10);	


		/*
		 * Action buttons
		 */
		JButton HitButton = new JButton("HIT");
		HitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gameplay.playerHit(deck);
				
				if (gameplay.playerCanHit()==false) {
					gameplay.playerHit(deck);
					HitButton.setEnabled(false);
				}
			}
		});

		HitButton.setBounds(208, 388, 105, 33);
		contentPane.add(HitButton);

		JButton StayButton = new JButton("STAY");
		StayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playing=1;
				MessageBox.setText("You have decided to Stay");
				HitButton.setEnabled(false);
				StayButton.setEnabled(false);
				gameplay.dealerTurn(deck);
				gameplay.winStatus();
			}
		});
		StayButton.setBounds(323, 388, 109, 33);
		contentPane.add(StayButton);



		/*
		 * Making invisible panels to draw the cards in
		 */
		panel1.setBackground(new Color(0, 102, 51));
		panel1.setBounds(36, 36, 71, 105);
		contentPane.add(panel1);

		panel2.setBackground(new Color(0, 102, 51));
		panel2.setBounds(117, 36, 71, 105);
		contentPane.add(panel2);

		panel3.setBackground(new Color(0, 102, 51));
		panel3.setBounds(198, 36, 71, 105);
		contentPane.add(panel3);

		panel4.setBackground(new Color(0, 102, 51));
		panel4.setBounds(279, 34, 71, 107);
		contentPane.add(panel4);

		panel5.setBackground(new Color(0, 102, 51));
		panel5.setBounds(364, 35, 71, 105);
		contentPane.add(panel5);

		panel6.setBackground(new Color(0, 102, 51));
		panel6.setBounds(445, 35, 71, 105);
		contentPane.add(panel6);

		panel7.setBackground(new Color(0, 102, 51));
		panel7.setBounds(532, 36, 71, 105);
		contentPane.add(panel7);

		panel8.setBackground(new Color(0, 102, 51));
		panel8.setBounds(36, 272, 71, 105);
		contentPane.add(panel8);

		panel9.setBackground(new Color(0, 102, 51));
		panel9.setBounds(117, 272, 70, 105);
		contentPane.add(panel9);

		panel10.setBackground(new Color(0, 102, 51));
		panel10.setBounds(198, 272, 72, 105);
		contentPane.add(panel10);

		panel11.setBackground(new Color(0, 102, 51));
		panel11.setBounds(280, 272, 71, 105);
		contentPane.add(panel11);

		panel12.setBackground(new Color(0, 102, 51));
		panel12.setBounds(365, 272, 71, 105);
		contentPane.add(panel12);

		panel13.setBackground(new Color(0, 102, 51));
		panel13.setBounds(446, 272, 71, 105);
		contentPane.add(panel13);

		panel14.setBackground(new Color(0, 102, 51));
		panel14.setBounds(532, 272, 71, 105);
		contentPane.add(panel14);


		gameplay = new Gameplay(deck, this);
	}


	/*
	 * the instructions on which methods to call for dealer and player to play and check for winner
	 */

	public void playgame() {
		while(playing==0) {
			//System.out.println(gameplay.getPlayerHand());
			while(gameplay.playerCanHit() == true) 
			{
				HitButton.setEnabled(true);
				StayButton.setEnabled(true);
				gameplay.playerrun(deck);
				//gameplay.playerHit(deck);
			}
		}


		while(playing==1) {
			while(gameplay.dealerCanHit()==true) {
				gameplay.dealerTurn(deck);
				if(gameplay.dealerCanHit()==false) {
					playing =2;
					gameplay.winStatus();
				}
			}
		}


		while (playing ==2) {
			gameplay.winStatus();
		}
	}


	public void addMessage(){
		MessageBox.setText(s);
	}


	public void setS(String news) {
		s = news;
	}



	//set image panels
	public void setPanel1(Card c) {
		if (c != null) {
			this.panel1.setCard(c);
			repaint();
		}
	}

	public void setPanel2(Card c) {
		this.panel2.setCard(c);
		repaint();
	}

	public void setPanel3 (Card c) {
		panel3.setCard(c);
		repaint();
	}

	public void setPanel4 (Card c) {
		panel4.setCard(c);
		repaint();
	}

	public void setPanel5(Card c) {
		panel5.setCard(c);
		repaint();
	}

	public void setPanel6(Card c) {
		panel6.setCard(c);
	}

	public void setPanel7(Card c) {
		panel7.setCard(c);
		repaint();
	}

	public void setPanel8(Card c) {
		panel8.setCard(c);
		repaint();
	}
	
	public void setPanel9(Card c) {
		panel9.setCard(c);
		repaint();
	}
	public void setPanel10(Card c) {
		panel10.setCard(c);
		repaint();
	}
	public void setPanel11(Card c) {
		panel11.setCard(c);
		repaint();
	}
	public void setPanel12(Card c) {
		panel12.setCard(c);
		repaint();
	}
	public void setPanel13(Card c) {
		panel13.setCard(c);
		repaint();
	}
	public void setPanel14(Card c) {
		panel14.setCard(c);
		repaint();
	}

}
