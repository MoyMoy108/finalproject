package FinalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartScreen extends JComponent implements ActionListener{
	
	JFrame frame = new JFrame();
	InstructionScreen screen2 = new InstructionScreen();
	
	public void display() {
		
	this.addFrame();
	this.addStartButton();
	this.addStartLabel();
		
	}
	
	
	public void addFrame() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 1000, 1000);
		frame.setBackground(Color.GREEN);  //not working!!!
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	
	public void addStartButton() {
		JButton start_button = new JButton("Start Game");  
		start_button.setBounds(100, 120, 100, 50);
		start_button.setBackground(Color.RED);
		frame.add(start_button);

		start_button.addActionListener(this);
	}
	
	
	public void addStartLabel() {
		JLabel welcome = new JLabel("Welcome to Black Jack");
		JLabel swag = new JLabel ("by Moises and Saigopal");
		welcome.setBounds(100, 70, 200, 40);
		welcome.setFont(new Font("Serif", Font.PLAIN, 20));
		swag.setBounds(100, 100, 200, 20);
		frame.add(welcome);
		frame.add(swag);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub	
	frame.setVisible(false);
	screen2.display();
	}
	
	

	
	
	
//	
//	public void paintComponent(Graphics g) {
//		Graphics2D g2 = (Graphics2D)g;
//		g2.drawString("Welcome to BlackJack", 300, 200);
//		g2.setBackground(Color.GREEN);
//		frame.print(g2);
//	
//	}

	
	
	
	
	
}
