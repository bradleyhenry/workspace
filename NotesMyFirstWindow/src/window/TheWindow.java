package window;
//Bradley Henry
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TheWindow implements ActionListener{
	//section one - create pieces of the window 
	JFrame window = new JFrame("Window Title");
	JPanel mainPanel = new JPanel(new GridLayout(10,10,2,2));
	JButton button = new JButton("click me");
	JLabel nameLabel = new JLabel("feet:");
	JTextArea feetText = new JTextArea(1,10);
	JLabel firstLabel = new JLabel("miles:");
	JTextArea milesText = new JTextArea(1,10);
	
	
	
	
	
	//section 2 - constructor, instructions for building the window
	public TheWindow() {
		mainPanel.add(button);
		mainPanel.setBackground(Color.CYAN);
		mainPanel.add(nameLabel);
		mainPanel.add(feetText);
		mainPanel.add(firstLabel);
		mainPanel.add(milesText);
		//tell action listener to look to the button
		button.addActionListener(this);
		
		window.add(mainPanel);
		//window.pack();
		window.setSize(300,300);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		
		
		
	}





	@Override
	public void actionPerformed(ActionEvent e) {
	
			if(e.getSource() == button) {
				//if you click the button
				//get # of feet from text box
				double feet = Double.parseDouble(feetText.getText());
				//math
				double miles = feet / 5280;
				//return answer- turn into String
				milesText.setText(Double.toString(miles));
				
				//random stuff
				button.setText("wjeinbqerj");
				button.setEnabled(false);
				button.removeActionListener(this);
				
				
				
				
			}
		
	}
}
	







