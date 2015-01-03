package usa;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class usaWindow {

		JFrame window = new JFrame("U.S.A");
		JPanel mainPanel = new JPanel(new GridLayout(2,1));
		JPanel top = new JPanel(new GridLayout(1,2));
		JPanel bottom = new JPanel(new GridLayout(6,1));
		JPanel stars = new JPanel();
		JPanel stripesTop = new JPanel(new GridLayout(7,1));
		JPanel red1 = new JPanel();
		JPanel white2 = new JPanel();
		JPanel red3 = new JPanel();
		JPanel white4 = new JPanel();
		JPanel red5 = new JPanel();
		JPanel white6 = new JPanel();
		JPanel red7 = new JPanel();
		JPanel white8 = new JPanel();
		JPanel red9 = new JPanel();
		JPanel white10 = new JPanel();
		JPanel red11 = new JPanel();
		JPanel white12 = new JPanel();
		JPanel red13 = new JPanel();
		JLabel pic = new JLabel(new ImageIcon("src//pics//stars.jpg"));
		
		public usaWindow() {
			mainPanel.add(top);
			mainPanel.add(bottom);
			top.add(stars);
			top.add(stripesTop);
			stars.add(pic);
			stripesTop.add(red1);
			stripesTop.add(white2);
			stripesTop.add(red3);
			stripesTop.add(white4);
			stripesTop.add(red5);
			stripesTop.add(white6);
			stripesTop.add(red7);
			bottom.add(white8);
			bottom.add(red9);
			bottom.add(white10);
			bottom.add(red11);
			bottom.add(white12);
			bottom.add(red13);
			red1.setBackground(Color.RED);
			red3.setBackground(Color.RED);
			red5.setBackground(Color.RED);
			red7.setBackground(Color.RED);
			red9.setBackground(Color.RED);
			red11.setBackground(Color.RED);
			red13.setBackground(Color.RED);
			white2.setBackground(Color.WHITE);
			white4.setBackground(Color.WHITE);
			white6.setBackground(Color.WHITE);
			white8.setBackground(Color.WHITE);
			white10.setBackground(Color.WHITE);
			white12.setBackground(Color.WHITE);
			window.add(mainPanel);
			window.setVisible(true);
			window.setSize(800,500);
			window.setLocationRelativeTo(null);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			
		}

}
