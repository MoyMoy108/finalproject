package FinalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;

public class NewStartScreen extends JFrame implements ActionListener{
static NewStartScreen frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new NewStartScreen();
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
	public NewStartScreen() {
		setTitle("Black Jack");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton StartButton = new JButton("Start");
		StartButton.setBackground(Color.GRAY);
		StartButton.setBounds(165, 106, 89, 23);
		StartButton.addActionListener(this);
		contentPane.add(StartButton);
		
		JLabel welcomeLabel = new JLabel("Welcome to Black Jack!");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setBounds(136, 49, 147, 46);
		contentPane.add(welcomeLabel);
		
		JLabel braggingLabel = new JLabel("By Moises and Saigopal");
		braggingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		braggingLabel.setBounds(136, 185, 147, 14);
		contentPane.add(braggingLabel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		NewInstructionScreen.main(null);
		frame.setVisible(false);
	}
}
