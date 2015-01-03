package thief;

import javax.swing.*;

import java.awt.*;
public class ThiefGUI {
	JFrame window = new JFrame("THEIF");
	JPanel mainPanel = new JPanel(new BorderLayout());
	JPanel centerPanel = new JPanel(new GridLayout(6,1,10,10));
	JPanel northPanel = new JPanel(new GridLayout());
	JPanel eastPanel =  new JPanel(new GridLayout());
	JPanel southPanel = new JPanel(new GridLayout());
	JPanel westPanel = new JPanel(new GridLayout());
	JPanel bottomPanel = new JPanel(new GridLayout(1,2,2,2));
	
	JLabel title = new JLabel("THEIF GOLD");
	JButton newGame = new JButton("New Game");
	JButton loadGame = new JButton("Load Game");
	JButton options = new JButton("Options");
	JButton credits = new JButton("Credits");
	JButton intro = new JButton("Intro");
	JButton quit = new JButton("Quit");
	
	JLabel pic1 = new JLabel(new ImageIcon("src//thief//ThiefBack.jpg"));
	JLabel pic2 = new JLabel("pic");
	JLabel pic3 = new JLabel("pic");
	JLabel pic4 = new JLabel("pic");

	
	public ThiefGUI(){
		mainPanel.add(BorderLayout.NORTH,northPanel);
		mainPanel.add(BorderLayout.EAST,eastPanel);
		mainPanel.add(BorderLayout.SOUTH,southPanel);
		mainPanel.add(BorderLayout.WEST,westPanel);
		mainPanel.add(BorderLayout.CENTER,centerPanel);
		
		//mainPanel.setBackground(Color.BLACK);
		//northPanel.setBackground(Color.black);
		//eastPanel.setBackground(Color.black);
		//southPanel.setBackground(Color.black);
		//westPanel.setBackground(Color.black);
		//centerPanel.setBackground(Color.ORANGE);
		//bottomPanel.setBackground(Color.ORANGE);
		westPanel.setOpaque(false);
		northPanel.setOpaque(false);
		southPanel.setOpaque(false);
		eastPanel.setOpaque(false);
		
		
		
		centerPanel.add(title);
		title.setLocation(512, 10);
		centerPanel.add(newGame);
		centerPanel.add(loadGame);
		centerPanel.add(options);
		centerPanel.add(credits);
		centerPanel.add(bottomPanel);
		bottomPanel.add(intro);
		bottomPanel.add(quit);
		
		title.setEnabled(false);
		
		
		
		mainPanel.add(pic1);
		northPanel.setPreferredSize(new Dimension(1024,30));
		
		//eastPanel.add(pic2);
		eastPanel.setPreferredSize(new Dimension(40,1024));
		
		//westPanel.add(pic3);
		westPanel.setPreferredSize(new Dimension(40,1024));
		
		//southPanel.add(pic4);
		southPanel.setPreferredSize(new Dimension(1024,30));
		
		window.add(mainPanel);
		window.setSize(500,500);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
		
		
}
