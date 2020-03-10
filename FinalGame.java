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

public class FinalGame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtEnterBetAmount;
	
	Deck deck = new Deck();
	Gameplay gameplay = new Gameplay(deck);
	static FinalGame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new FinalGame();
					frame.setVisible(true);
				} catch (Exception e) {
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
		
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setBounds(0, 0, 212, 98);
		addPopup(contentPane, popupMenu);
		
		JButton btnNewButton_1 = new JButton("Place bet");
		popupMenu.add(btnNewButton_1);
		
		txtEnterBetAmount = new JTextField();
		txtEnterBetAmount.setText("Enter Bet amount");
		popupMenu.add(txtEnterBetAmount);
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
			}
		});
		btnNewButton.setBounds(139, 219, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnStay = new JButton("STAY");
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
		
		ImagePanel panel_6 = new ImagePanel();
		panel_6.setBackground(new Color(0, 102, 51));
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
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
