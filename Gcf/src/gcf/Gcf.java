package gcf;
//bradley henry
//connor kinn
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gcf implements ActionListener {
	boolean loop = false;
	int x,y;
	JFrame window = new JFrame("GCF");
	JPanel mainPanel = new JPanel(new GridLayout(2,2,10,10));
	JTextArea input1 = new JTextArea();
	JTextArea input2 = new JTextArea();
	JTextArea output = new JTextArea();
	JButton work = new JButton("work");
	public Gcf() {
		mainPanel.add(input1);
		input1.setBackground(Color.GRAY);
		mainPanel.add(input2);
		input2.setBackground(Color.GRAY);
		mainPanel.add(output);
		output.setBackground(Color.GRAY);

		mainPanel.add(work);
		work.addActionListener(this);
		window.add(mainPanel);
		window.setVisible(true);
		window.setSize(500,500);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == work){
		 x = Integer.parseInt(input1.getText());
		 y = Integer.parseInt(input2.getText());
		output.setText(Integer.toString(great(x,y)));
		}
		
	}
	public int great(int x,int y){
		
			loop = true;
			while(loop){
				if (x == y){	
					return x;
				}
				if (x > y){
					x = x-y;
				}
				else if (x < y){
					y = y-x;
				}
					
			}
		return 0;
	}
}

	

