package studentGrades;

import java.awt.GridLayout;

import javax.swing.*;

public class GUI {
	
	JFrame window = new JFrame("Student Grade Program");
	JPanel mainPanel = new JPanel(new GridLayout(1,4,2,2));
	JPanel lastName = new JPanel(new GridLayout(34,1,2,2));
	JPanel firstName = new JPanel(new GridLayout(34,1,2,2));
	JPanel hw = new JPanel(new GridLayout(34,1,2,2));
	JPanel test = new JPanel(new GridLayout(34,1,2,2));
	//array of JLabel
	JLabel[] lastNameLbl = new JLabel[34];
	JLabel[] firstNameLbl = new JLabel[34];
	JTextArea[] hwText = new JTextArea[34];
	JTextArea[] testText = new JTextArea[34];
	
	
	public GUI (){
		for(int i=0;i<=33;i++){
			lastNameLbl[i] = new JLabel("last" + i);
			firstNameLbl[i] = new JLabel("first" + i);
			
			lastName.add(lastNameLbl[i]);
			firstName.add(firstNameLbl[i]);
			
			hwText[i] = new JTextArea(1,10);
			testText[i] = new JTextArea(1,10);
			hw.add(hwText[i]);
			test.add(testText[i]);
		}
		mainPanel.add(firstName);
		mainPanel.add(lastName);
		mainPanel.add(hw);
		mainPanel.add(test);
		mainPanel.add(hw);
		mainPanel.add(test);
		window.add(mainPanel);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
