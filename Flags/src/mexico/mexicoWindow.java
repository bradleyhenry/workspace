package mexico;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class mexicoWindow {
	
	JFrame window = new JFrame("Mexico");
	JPanel mainPanel = new JPanel(new GridLayout(1,3));
	JPanel green = new JPanel();
	JPanel white = new JPanel();
	JPanel red = new JPanel();
	JLabel pic = new JLabel(new ImageIcon("src//pics//bird.jpg"));
	
	public mexicoWindow() {
		mainPanel.add(green);
		green.setBackground(Color.GREEN);
		mainPanel.add(white);
		white.setLayout(new GridBagLayout());
		white.setBorder(BorderFactory.createEmptyBorder());
		white.add(pic);
		mainPanel.add(red);
		red.setBackground(Color.RED);
		window.add(mainPanel);
		window.setVisible(true);
		window.setSize(800,500);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
