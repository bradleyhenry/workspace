package dataCollection;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Window implements ActionListener{

	JFrame window = new JFrame("Data Collection");
	JPanel mainPanel = new JPanel();
	JButton submit = new JButton("Submit");
	JTextArea name = new JTextArea(1,10);
	JTextArea grade = new JTextArea(1,10);
	JTextArea age = new JTextArea(1,10);
	JTextArea gender = new JTextArea(1,10);
	JLabel labelName = new JLabel("Name");
	JLabel labelGrade = new JLabel("Grade");
	JLabel labelAge = new JLabel("Age");
	JLabel labelGender = new JLabel("Gender");
	String nameString;
	public Window() { 
		mainPanel.add(labelName);
		mainPanel.add(name);
		mainPanel.add(labelGrade);
		mainPanel.add(grade);
		mainPanel.add(labelAge);
		mainPanel.add(age);
		mainPanel.add(labelGender);
		mainPanel.add(gender);
		mainPanel.add(submit);
		submit.addActionListener(this);
		mainPanel.setBackground(Color.CYAN);
		window.add(mainPanel);
		window.setSize(300,300);
		window.setVisible(true);
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == submit){
			//nameString = name.getText();
			//nameString = grade.getText();
			//nameString = age.getText();
			//nameString = gender.getText();
			
			//this(new BufferedWriter(new FileWriter(file)),false);
			PrintWriter Writer;
			//FileWriter Writer;
			try {           //print
				Writer = new PrintWriter("src//dataCollection//file.txt");
				Writer.println(name.getText());
				Writer.println(grade.getText());
				Writer.println(age.getText());
				Writer.println(gender.getText());
				Writer.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
				
			
			
	
	}
	}
}
