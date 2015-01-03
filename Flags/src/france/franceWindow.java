package france;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class franceWindow {
	
	JFrame window = new JFrame("France");
	JPanel mainPanel = new JPanel(new GridLayout(1,3));
	JPanel blue = new JPanel();
	JPanel white = new JPanel();
	JPanel red = new JPanel();
	
	public franceWindow() {
		mainPanel.add(blue);
		blue.setBackground(Color.BLUE);
		mainPanel.add(white);
		mainPanel.add(red);
		red.setBackground(Color.RED);
		window.add(mainPanel);
		window.setVisible(true);
		window.setSize(800,500);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
