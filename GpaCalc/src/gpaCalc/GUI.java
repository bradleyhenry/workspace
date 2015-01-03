package gpaCalc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI implements ActionListener{
	int grade1,grade2,grade3,grade4;
	double sumGrade,grade;
	
	String score1,score2,score3,score4;
	JFrame window = new JFrame("GPA Calculator");
	
	JPanel mainPanel = new JPanel(new GridLayout(5,2,10,10));
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	
	JButton button = new JButton("Calculate GPA");
	JButton clearButton = new JButton("Clear");
	
	JLabel class1 = new JLabel("Class grade 1");
	JLabel class2 = new JLabel("Class grade 2");
	JLabel class3 = new JLabel("Class grade 3");
	JLabel class4 = new JLabel("Class grade 4");
	
	JTextArea class01 = new JTextArea(1,1);
	JTextArea class02 = new JTextArea(1,1);
	JTextArea class03 = new JTextArea(1,1);
	JTextArea class04 = new JTextArea(1,1);
	
	public GUI() {
		mainPanel.add(class1);
		//mainPanel.add(class01);
		mainPanel.add(panel1);
		panel1.add(class01);
		panel1.setBackground(Color.GREEN);
		
		
		mainPanel.add(class2);
		//mainPanel.add(class02);
		mainPanel.add(panel2);
		panel2.add(class02);
		panel2.setBackground(Color.GREEN);
		
		
		mainPanel.add(class3);
		//mainPanel.add(class03);
		mainPanel.add(panel3);
		panel3.add(class03);
		panel3.setBackground(Color.GREEN);
		
		
		mainPanel.add(class4);
		//mainPanel.add(class04);
		mainPanel.add(panel4);
		panel4.add(class04);
		panel4.setBackground(Color.GREEN);
		
		
		mainPanel.add(button);
		mainPanel.add(clearButton);
		clearButton.addActionListener(this);
		mainPanel.setBackground(Color.GREEN);
		button.addActionListener(this);
		window.add(mainPanel);
		window.setVisible(true);
		window.setSize(500,500);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent click) {
		if (click.getSource() == clearButton) {
			//clear all fields
			class01.setText("");
			class02.setText("");
			class03.setText("");
			class04.setText("");
		}
		
		if(click.getSource() == button) {
			String score1 = (class01.getText());
			String score2 = (class02.getText());
			String score3 = (class03.getText());
			String score4 = (class04.getText());
			
			if(score1.equals("a")) {
				grade1 = 4;
			}else if(score1.equals("b")){
					grade1 = 3;
			}else if(score1.equals("c")){
					grade1 = 2;
			}else if(score1.equals("d")){
					grade1 = 1;
			}else if(score1.equals("f")){
					grade1 = 0;
			}
			if(score2.equals("a")) {
				grade2 = 4;
			}else if(score2.equals("b")){
					grade2 = 3;
			}else if(score2.equals("c")){
					grade2 = 2;
			}else if(score2.equals("d")){
					grade2 = 1;
			}else if(score2.equals("f")){
					grade2 = 0;
			}
			if(score3.equals("a")) {
				grade3 = 4;
			}else if(score3.equals("b")){
					grade3 = 3;
			}else if(score3.equals("c")){
					grade3 = 2;
			}else if(score3.equals("d")){
					grade3 = 1;
			}else if(score3.equals("f")){
					grade3 = 0;
			}
			if(score4.equals("a")) {
				grade4 = 4;
			}else if(score4.equals("b")){
				grade4 = 3;
			}else if(score4.equals("c")){
				grade4 = 2;
			}else if(score4.equals("d")){
					grade4 = 1;
			}else if(score4.equals("f")){
					grade4 = 0;
			}
			sumGrade = grade1+grade2+grade3+grade4;
			grade = sumGrade/4;
			//System.out.print("GPA=");
			//System.out.println(grade);
			JOptionPane.showMessageDialog(null,"Your GPA is " + grade);
			
			
			
				}
		}

}