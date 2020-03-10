package FinalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class NewInstructionScreen extends JFrame implements ActionListener {

	static NewInstructionScreen frame;
	private JPanel contentPane;
	FinalGame finalgame = new FinalGame();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new NewInstructionScreen();
					frame.setResizable(false);
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
	public NewInstructionScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INSTRUCTIONS");
		lblNewLabel.setBackground(new Color(0, 102, 51));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(154, 11, 119, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Let's Play!");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(154, 202, 119, 34);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
		
		JTextArea txtrWelcomeToBlack = new JTextArea();
		txtrWelcomeToBlack.setText("Welcome to Black Jack!\r\n\r\nHere are the rules!!!");
		txtrWelcomeToBlack.setBounds(38, 48, 361, 148);
		contentPane.add(txtrWelcomeToBlack);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.setVisible(false);
		try {
			FinalGame.main(null);
			//finalgame.playgame();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
