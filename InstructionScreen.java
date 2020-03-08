package FinalProject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InstructionScreen extends JComponent implements ActionListener{
	
	
	ComponentScreen screen3 = new ComponentScreen();
	JFrame frame = new JFrame();
	
	public void display() {
		
		this.addFrame();
		this.addStartButton();
		this.addStartLabel();
			
		}

	
	
	public void addFrame() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 1000, 1000);
		frame.setBackground(Color.GREEN);
		frame.setVisible(true);
	}
	
	
	public void addStartButton() {
		JButton start_button = new JButton("Let's play folks!");  
		start_button.setBounds(100, 100, 100, 100);
		start_button.setBackground(Color.BLUE);
		frame.add(start_button);

		start_button.addActionListener(this);
	}
	
	
	public void addStartLabel() {
		JLabel welcome = new JLabel("Read me!!!");
		welcome.setBounds(100, 70, 200, 20);
		frame.add(welcome);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.setVisible(false);
		screen3.display();
	}
		
}
