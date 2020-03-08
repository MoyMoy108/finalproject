package FinalProject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComponentScreen extends JComponent implements ActionListener{
	
	JFrame frame = new JFrame();

	public void display() {

		this.addFrame();
		this.addHitButton();
		this.addStayButton();
		this.addYouLabel();
		this.addDealerLabel();

	}



	public void addFrame() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 1000, 1000);
		frame.setBackground(Color.GREEN);
		//frame set resize = false
		frame.setVisible(true);
	}


	public void addHitButton() {
		JButton start_button = new JButton("HIT!");  
		start_button.setBounds(100, 100, 100, 100);
		start_button.setBackground(Color.GRAY);
		frame.add(start_button);

		start_button.addActionListener(this);
	}
	
	public void addStayButton() {
		JButton start_button = new JButton("STAY!");  
		start_button.setBounds(200, 100, 100, 100);
		start_button.setBackground(Color.GRAY);
		frame.add(start_button);

		start_button.addActionListener(this);
	}


	public void addYouLabel() {
		JLabel welcome = new JLabel("YOU");
		welcome.setBounds(100, 500, 200, 20);
		frame.add(welcome);
	}
	
	public void addDealerLabel() {
		JLabel welcome = new JLabel("DEALER");
		welcome.setBounds(100, 50, 200, 20);
		frame.add(welcome);
	}

	@Override
	public void actionPerformed(ActionEvent e2) {
		// TODO Auto-generated method stub

	}

}

