package FinalProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InstructionScreen extends JComponent implements ActionListener{


	ComponentScreen screen3 = new ComponentScreen();
	JFrame frame = new JFrame();
	//JPanel panel = new JPanel();

	public void display() {

		this.addFrame();
		addStartButton();
		addInstructionsLabel();
		addInstructionBox();
		
		//this.addPanel();
		

	}
//	public void addPanel(){
//		panel.setSize(1000, 1000);
//		panel.setBackground(Color.green);
//		//panel.setVisible(true);
//	}


	public void addStartButton() {
		JButton start_button = new JButton("Let's play folks!");  
		start_button.setBounds(100, 500, 100, 100);
		start_button.setBackground(Color.gray);
		frame.add(start_button);

		start_button.addActionListener(this);
	}


	public void addInstructionsLabel() {
		JLabel welcome = new JLabel("THE INSTRUCTIONS");
		//welcome.setBorder();
		welcome.setBounds(100, 70, 200, 20);
		welcome.setFont(new Font("Serif", Font.PLAIN, 20));
		frame.add(welcome);
	}

	public void addInstructionBox() {
		JTextField  instructions = new JTextField(16);//change this text --> may need to make a JTextfield for every line
		instructions.setText("Welcome to blackjack, this is the best game ever!!!!!" + "\n" + "hello"+ "\n hello again" + "\n hello again again ");
		instructions.setBounds(100, 200, 200, 20);
		instructions.setBackground(Color.LIGHT_GRAY);
		frame.add(instructions);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.setVisible(false);
		screen3.display();
	}


	public void addFrame() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 1000, 1000);
		frame.setBackground(Color.GREEN);
		frame.setResizable(false);
		
		//frame.pack();
		frame.setVisible(true);

	}


}
