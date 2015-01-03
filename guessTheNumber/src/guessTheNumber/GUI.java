package guessTheNumber;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class GUI implements ActionListener  {

	JFrame window = new JFrame("Guess The Number!");
	JPanel mainPanel = new JPanel(new GridLayout(3,2,10,10));
	JButton randomize = new JButton("Randomize");
	JButton guess = new JButton("Guess");
	JTextArea input = new JTextArea();
	JLabel guessLabel = new JLabel("Guess");
	JLabel count = new JLabel("Count");
	JTextArea counter = new JTextArea();
	int guesses = 1, guessed = 0,num = 0;
	Random gen = new Random();
	
	public GUI() {
		mainPanel.add(guessLabel);
		mainPanel.add(input);
		mainPanel.add(count);
		mainPanel.add(counter);
		mainPanel.add(randomize);
		mainPanel.add(guess);
		mainPanel.setBackground(Color.MAGENTA);
		input.setBackground(Color.CYAN);
		counter.setBackground(Color.CYAN);
		guess.addActionListener(this);
		randomize.addActionListener(this);
		window.add(mainPanel);
		window.setVisible(true);
		window.setSize(500,500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == randomize){
			num = gen.nextInt(100) + 1;
			guesses = 1;
		}
		if (e.getSource() == guess) {
			guessed = Integer.parseInt(input.getText()); 
			input.setText("");
			if (num == guessed){
				JOptionPane.showMessageDialog(null,"You guessed in "+guesses+" guesses!");
			}
			else if(num != guessed){
				if (num < guessed)
					counter.setText(guesses +" guesse(s)\n"+guessed +" is high\n");
				else
					counter.setText(guesses +" guesse(s)\n"+guessed +" is low\n");
			guesses = 1 + guesses;

			}
			
		
		}
		
		
	}
	





}

