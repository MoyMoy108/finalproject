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
	JButton btnNewButton;
	JButton btnStay;
	//img panels
	public ImagePanel panel_6 = new ImagePanel();


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
	 * Create the frame.
	 */
	public FinalGame() {
		
		setTitle("Black Jack");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 347);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);


		txtEnterBetAmount = new JTextField();
		txtEnterBetAmount.setText("Enter Bet amount");
		txtEnterBetAmount.setColumns(10);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Dealer");
		lblNewLabel.setBounds(222, 11, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblPlayer = new JLabel("Player");
		lblPlayer.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlayer.setBounds(222, 247, 46, 14);
		contentPane.add(lblPlayer);

		JButton btnNewButton = new JButton("HIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gameplay.playerHit(deck);
				if (gameplay.playerCanHit()==false) {
					gameplay.playerHit(deck);
					btnNewButton.setEnabled(false);
				}
			}
		});

		btnNewButton.setBounds(139, 219, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnStay = new JButton("STAY");
		btnStay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playing=1;
				MessageBox.setText("You have decided to Stay");
				btnNewButton.setEnabled(false);
				btnStay.setEnabled(false);
				gameplay.dealerTurn(deck);
			}
		});
		btnStay.setBounds(238, 219, 89, 23);
		contentPane.add(btnStay);

		JLabel lblNewLabel_1 = new JLabel("Total Assets");
		lblNewLabel_1.setBounds(419, 247, 80, 14);
		contentPane.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(413, 272, 86, 20);
		contentPane.add(textField);
		textField.setText("hello");
		textField.setColumns(10);


		panel_6.setBackground(new Color(255, 102, 51));
		panel_6.setBounds(61, 35, 46, 69);
		contentPane.add(panel_6);

		ImagePanel panel_6_1 = new ImagePanel();
		panel_6_1.setBackground(new Color(0, 102, 51));
		panel_6_1.setBounds(117, 35, 46, 69);
		contentPane.add(panel_6_1);

		ImagePanel panel_6_2 = new ImagePanel();
		panel_6_2.setBackground(new Color(0, 102, 51));
		panel_6_2.setBounds(173, 35, 46, 69);
		contentPane.add(panel_6_2);

		ImagePanel panel_6_3 = new ImagePanel();
		panel_6_3.setBackground(new Color(0, 102, 51));
		panel_6_3.setBounds(232, 36, 46, 69);
		contentPane.add(panel_6_3);

		ImagePanel panel_6_4 = new ImagePanel();
		panel_6_4.setBackground(new Color(0, 102, 51));
		panel_6_4.setBounds(288, 35, 46, 69);
		contentPane.add(panel_6_4);

		ImagePanel panel_6_5 = new ImagePanel();
		panel_6_5.setBackground(new Color(0, 102, 51));
		panel_6_5.setBounds(344, 35, 46, 69);
		contentPane.add(panel_6_5);

		ImagePanel panel_6_6 = new ImagePanel();
		panel_6_6.setBackground(new Color(0, 102, 51));
		panel_6_6.setBounds(400, 35, 46, 69);
		contentPane.add(panel_6_6);

		ImagePanel panel_6_7 = new ImagePanel();
		panel_6_7.setBackground(new Color(0, 102, 51));
		panel_6_7.setBounds(61, 151, 46, 69);
		contentPane.add(panel_6_7);

		ImagePanel panel_6_8 = new ImagePanel();
		panel_6_8.setBackground(new Color(0, 102, 51));
		panel_6_8.setBounds(117, 151, 46, 69);
		contentPane.add(panel_6_8);

		ImagePanel panel_6_9 = new ImagePanel();
		panel_6_9.setBackground(new Color(0, 102, 51));
		panel_6_9.setBounds(173, 151, 46, 69);
		contentPane.add(panel_6_9);

		ImagePanel panel_6_10 = new ImagePanel();
		panel_6_10.setBackground(new Color(0, 102, 51));
		panel_6_10.setBounds(232, 151, 46, 69);
		contentPane.add(panel_6_10);

		ImagePanel panel_6_11 = new ImagePanel();
		panel_6_11.setBackground(new Color(0, 102, 51));
		panel_6_11.setBounds(288, 151, 46, 69);
		contentPane.add(panel_6_11);

		ImagePanel panel_6_12 = new ImagePanel();
		panel_6_12.setBackground(new Color(0, 102, 51));
		panel_6_12.setBounds(344, 151, 46, 69);
		contentPane.add(panel_6_12);

		ImagePanel panel_6_13 = new ImagePanel();
		panel_6_13.setBackground(new Color(0, 102, 51));
		panel_6_13.setBounds(400, 151, 46, 69);
		contentPane.add(panel_6_13);


		MessageBox.setText("Message Box");
		MessageBox.setHorizontalAlignment(SwingConstants.CENTER);
		MessageBox.setBounds(117, 272, 273, 20);
		contentPane.add(MessageBox);
		MessageBox.setColumns(10);


		JLabel current_bet_label = new JLabel("Current Bet");
		current_bet_label.setBounds(10, 247, 89, 14);
		contentPane.add(current_bet_label);

		current_bet = new JTextField();
		current_bet.setBounds(10, 272, 89, 20);
		contentPane.add(current_bet);
		current_bet.setColumns(10);
		
		gameplay = new Gameplay(deck, this);
	}


	public void playgame() {
		while(playing==0) {
			//System.out.println(gameplay.getPlayerHand());
			while(gameplay.playerCanHit() == true) 
			{
				btnNewButton.setEnabled(true);
				btnStay.setEnabled(true);
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
	public void setPanel_6(Card c) {
		ImagePanel testPanel = new ImagePanel();
		testPanel.setBounds(61, 35, 46, 69);
		testPanel.setCard(c);
		contentPane.add(testPanel);
		System.out.println(c.toString());
		if (c != null) {
			//this.panel_6.setCard(c);
		}
	}

	//	public void setPanel_6_1() {
	//		panel_6_1.
	//	}
	//	
	//	public void setPanel_6_2() {
	//		panel_6_2.
	//	}
	//	
	//	public void setPanel_6_3() {
	//		panel_6_3.
	//	}
	//	
	//	public void setPanel_6_4() {
	//		panel_6_4.
	//	}
	//	
	//	public void setPanel_6_5() {
	//		panel_6_5.
	//	}
	//	
	//	public void setPanel_6_6() {
	//		panel_6_6.
	//	}
	//	
	//	public void setPanel_6_7() {
	//		panel_6_7.
	//	}
	//	public void setPanel_6_8() {
	//	panel_6_8.
	//}
	//public void setPanel_6_9() {
	//	panel_6_9.
	//}
	//public void setPanel_6_10() {
	//	panel_6_10.
	//}
	//public void setPanel_6_11() {
	//	panel_6_11.
	//}
	//public void setPanel_6_12() {
	//	panel_6_12.
	//}
	//public void setPanel_6_13() {
	//	panel_6_13.
	//}

}
