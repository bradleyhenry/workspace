package calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui  implements ActionListener {
	double x,y,z;
	String operator;

	JFrame window = new JFrame();
	JPanel mainPanel = new JPanel(new BorderLayout());
	JPanel north = new JPanel();
	JPanel center = new JPanel(new GridLayout(5,5,5,5));
	
	JButton back = new JButton("back");
	JButton clearAll= new JButton("CE");
	JButton clear= new JButton("C");
	JButton negitive = new JButton("+-");
	JButton root= new JButton("root");
	JButton divide= new JButton("/");
	JButton percent= new JButton("%");
	JButton multiply= new JButton("*");
	JButton oneOver= new JButton("1/X");
	JButton minus = new JButton("-");
	JButton plus= new JButton("+");
	JButton equal = new JButton("=");
	JButton decimal= new JButton(".");
	JButton zero = new JButton("0");
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	
	JTextArea display = new JTextArea(3,44);
	
	public Gui() {
		mainPanel.add(BorderLayout.NORTH,north);
		north.add(display);
		
		mainPanel.add(BorderLayout.CENTER,center);
		center.add(back);
		back.addActionListener(this);
		center.add(clearAll);
		clearAll.addActionListener(this);
		center.add(clear);
		clear.addActionListener(this);
		center.add(negitive);
		negitive.addActionListener(this);
		center.add(root);
		root.addActionListener(this);
		center.add(seven);
		seven.addActionListener(this);
		center.add(eight);
		eight.addActionListener(this);
		center.add(nine);
		nine.addActionListener(this);
		center.add(divide);
		divide.addActionListener(this);
		center.add(percent);
		percent.addActionListener(this);
		center.add(four);
		four.addActionListener(this);
		center.add(five);
		five.addActionListener(this);
		center.add(six);
		six.addActionListener(this);
		center.add(multiply);
		multiply.addActionListener(this);
		center.add(oneOver);
		oneOver.addActionListener(this);
		center.add(one);
		one.addActionListener(this);
		center.add(two);
		two.addActionListener(this);
		center.add(three);
		three.addActionListener(this);
		center.add(minus);
		minus.addActionListener(this);
		center.add(plus);
		plus.addActionListener(this);
		center.add(zero);
		zero.addActionListener(this);
		center.add(decimal);
		decimal.addActionListener(this);
		center.add(equal);
		equal.addActionListener(this);
		
		
		
		window.add(mainPanel);
		window.setSize(500,500);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == one) {
			//append to the text area
			display.setText(display.getText() + one.getText());
			
		}
		if (e.getSource() == two) {
			display.setText(display.getText() + two.getText());
		}
		if (e.getSource() == three) {
			display.setText(display.getText() + three.getText());
		}
		if (e.getSource() == four) {
			display.setText(display.getText() + four.getText());
		}
		if (e.getSource() == five) {
			display.setText(display.getText() + five.getText());
		}
		if (e.getSource() == six) {
			display.setText(display.getText() + six.getText());
		}
		if (e.getSource() == seven) {
			display.setText(display.getText() + seven.getText());
		}
		if (e.getSource() == eight) {
			display.setText(display.getText() + eight.getText());
		}
		if (e.getSource() == nine) {
			display.setText(display.getText() + nine.getText());
		}
		if (e.getSource() == decimal){
			display.setText(display.getText() + decimal.getText());
		}
		if (e.getSource() == zero) {
			display.setText(display.getText() + zero.getText());
		}
		if (e.getSource() == back) {
			
		}
		if (e.getSource() == clearAll) {
			x = 0;
			y = 0;
			z = 0;
			display.setText("");
		}
		if (e.getSource() == clear) {
			
		}
		if (e.getSource() == negitive) {
			display.setText("-");
		}
		if (e.getSource() == root) {
			x = Double.parseDouble(display.getText());
			operator = "root";
			
		}
		if (e.getSource() == divide) {
			x = Double.parseDouble(display.getText());
			display.setText("");
			operator = "/";
		}
		if (e.getSource() == percent) {
			x = Double.parseDouble(display.getText());
			display.setText("");
			operator = "%";
			
		}
		if (e.getSource() == multiply) {
			x = Double.parseDouble(display.getText());
			display.setText("");
			operator = "*";
		}
		if (e.getSource() == oneOver) {
			
		}
		if (e.getSource() == minus) {
			x = Double.parseDouble(display.getText());
			display.setText("");
			operator = "-";
		}
		if (e.getSource() == plus) {
			x = Double.parseDouble(display.getText());
			display.setText("");
			operator = "+";
			
			
			
		}
		if (e.getSource() == equal) {
			if (operator == "%"){
				z = x*100;
			} else {
					y = Double.parseDouble(display.getText());
			}
			if (operator == "+"){
					z = x + y;
			} else if(operator == "-"){
				z = x - y;
			} else if(operator == "*"){
				z = x * y;
			} else if(operator == "/"){
				z = x / y;
			}else if (operator == "%"){
				z = x*100;
			}else if (operator == "root"){
				z = Math.sqrt(x);
			}
			
			
			display.setText(Double.toString(z));
		}
		
	}
	
}
