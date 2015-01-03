package germany;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class germanWindow {
// grerman france mexico usa iceland
		JFrame window = new JFrame("Germany");
		JPanel mainPanel = new JPanel(new GridLayout(3,1));
		JPanel black = new JPanel();
		JPanel red = new JPanel();
		JPanel yellow = new JPanel();
		
		public germanWindow() {
			mainPanel.add(black);
			black.setBackground(Color.BLACK);
			mainPanel.add(red);
			red.setBackground(Color.RED);
			mainPanel.add(yellow);
			yellow.setBackground(Color.YELLOW);
			window.add(mainPanel);
			window.setVisible(true);
			window.setSize(800,500);
			window.setLocationRelativeTo(null);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
	
	
}




