package pizzaOrder;
//bradley henry
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class PizzaGUI implements ActionListener{
		final int SMPRICE = 10, MDPRICE = 15, LGPRICE = 20,WGPRICE = 5, BDPRICE = 3, TOPPINGPRICE = 2, DELIVERYCHARGE = 5;
		final double TAX = 0.06;
		
		double baconPrice = 0, pepperoniPrice = 0, sausagePrice = 0, hamPrice = 0, pineapplePrice = 0;
		JFrame window = new JFrame("PizzaRUs");
		JPanel mainPanel = new JPanel(new GridLayout(2,1));
		JPanel topPanel = new JPanel(new GridLayout(1,3,10,10));
		JPanel bottomPanel = new JPanel(new GridLayout(1,3,10,10));
		JPanel sizes = new JPanel(new GridLayout(3,2,5,5));
		JPanel sides = new JPanel(new GridLayout(2,2,5,5));
		JPanel picture = new JPanel();
		JPanel toppings = new JPanel(new GridLayout(5,2,5,5));
		JPanel largePanel = new JPanel();
		JPanel mediumPanel = new JPanel();
		JPanel smallPanel = new JPanel();
		JPanel wingPanel = new JPanel();
		JPanel breadstickPanel = new JPanel();
		JPanel reciving  = new JPanel(new GridLayout(2,2,5,5));
		JPanel buttons = new JPanel(new GridLayout(1,3,5,5));
		JPanel orderPanel = new JPanel();
		JPanel clearPanel = new JPanel();
		JPanel exitPanel = new JPanel();
		
		
		JTextArea large = new JTextArea(1,3);
		JTextArea medium = new JTextArea(1,3);
		JTextArea small = new JTextArea(1,3);
		
		JLabel largeText = new JLabel("Large $20");
		JLabel mediumText = new JLabel("Medium $15");
		JLabel smallText = new JLabel("Small $10");

		JCheckBox bacon = new JCheckBox();
		JCheckBox pepperoni = new JCheckBox();
		JCheckBox sausage = new JCheckBox();
		JCheckBox ham = new JCheckBox();
		JCheckBox pineapple = new JCheckBox();
		
		JLabel baconText = new JLabel("Bacon $2");
		JLabel pepperoniText = new JLabel("Pepperoni $2");
		JLabel sausageText = new JLabel("Sausage $2");
		JLabel hamText = new JLabel("Ham $2");
		JLabel pineappleText = new JLabel("Pineapple $2");
		
		JTextArea wings = new JTextArea(1,3);
		JTextArea breadsticks = new JTextArea(1,3);
		
		JLabel wingsText = new JLabel("Wings $5");
		JLabel breadsticksText = new JLabel("Breadsticks $3");
		
		JCheckBox delivery = new JCheckBox();
		JCheckBox pickup = new JCheckBox();
		
		JLabel deliveryText = new JLabel("Delivery $5");
		JLabel pickupText = new JLabel("Pickup No extra Charge");
		
		JButton order = new JButton("Order");
		JButton clear  = new JButton("Clear");
		JButton exit = new JButton("Exit");
		
		JLabel pic = new JLabel(new ImageIcon("src//pizzaOrder//images//pizza.png"));
		
		public PizzaGUI() {
			
			sizes.add(largePanel);
			largePanel.setLayout(new GridBagLayout());
	        largePanel.add(large);
	        largePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			largePanel.setBackground(Color.green);
			sizes.add(largeText);
			
			sizes.add(mediumPanel);
			mediumPanel.setLayout(new GridBagLayout());
	        mediumPanel.add(medium);
	        mediumPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			mediumPanel.setBackground(Color.green);
			sizes.add(mediumText);
			
			sizes.add(smallPanel);
			smallPanel.setLayout(new GridBagLayout());
	        smallPanel.add(small);
	        smallPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));;
			smallPanel.setBackground(Color.green);
			
			sizes.add(smallText);
			sizes.setOpaque(false);
			
			sides.add(wingPanel);
			wingPanel.setLayout(new GridBagLayout());
	        wingPanel.add(wings);
	        wingPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			wingPanel.setBackground(Color.green);
			sides.add(wingsText);
			
			sides.add(breadstickPanel);
			breadstickPanel.setLayout(new GridBagLayout());
	        breadstickPanel.add(breadsticks);
	        breadstickPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			breadstickPanel.setBackground(Color.green);
			
			sides.add(breadsticksText);
			sides.setOpaque(false);
			
			picture.add(pic);
			picture.setOpaque(false);
			
			toppings.add(bacon);
			toppings.add(baconText);
			toppings.add(pepperoni);
			toppings.add(pepperoniText);
			toppings.add(sausage);
			toppings.add(sausageText);
			toppings.add(ham);
			toppings.add(hamText);
			toppings.add(pineapple);
			toppings.add(pineappleText);
			toppings.setOpaque(false);
			bacon.setBackground(Color.green);
			baconText.setBackground(Color.green);
			pepperoni.setBackground(Color.green);
			pepperoniText.setBackground(Color.green);
			sausageText.setBackground(Color.green);
			sausage.setBackground(Color.green);
			ham.setBackground(Color.green);
			hamText.setBackground(Color.green);
			pineapple.setBackground(Color.green);
			pineappleText.setBackground(Color.green);
			delivery.setBackground(Color.green);
			pickup.setBackground(Color.green);
			
			reciving.add(delivery);
			delivery.addActionListener(this);
			reciving.add(deliveryText);
			reciving.add(pickup);
			pickup.addActionListener(this);
			reciving.add(pickupText);
			reciving.setOpaque(false);
			
			
			
			
			buttons.add(orderPanel);
			orderPanel.setLayout(new GridBagLayout());
	        orderPanel.add(order);
	        orderPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			orderPanel.setBackground(Color.green);
			
			buttons.add(clearPanel);
			clearPanel.setLayout(new GridBagLayout());
	        clearPanel.add(clear);
	        clearPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			clearPanel.setBackground(Color.green);
			
			buttons.add(exitPanel);
			exitPanel.setLayout(new GridBagLayout());
	        exitPanel.add(exit);
	        exitPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			exitPanel.setBackground(Color.green);
			
			order.addActionListener(this);
			exit.addActionListener(this);
			clear.addActionListener(this);
			buttons.setOpaque(false);

			topPanel.add(sizes);
			topPanel.add(sides);
			topPanel.add(pic);
			topPanel.setOpaque(false);
			
			bottomPanel.add(toppings);
			bottomPanel.add(reciving);
			bottomPanel.add(buttons);
			bottomPanel.setOpaque(false);
			
			mainPanel.add(topPanel);
			mainPanel.add(bottomPanel);
			mainPanel.setBackground(Color.GREEN);
			
			
			window.add(mainPanel);
			window.setVisible(true);
			window.setSize(1000,1000);
			window.setLocationRelativeTo(null);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == delivery){
				pickup.setSelected(false);
			}
			if (e.getSource() == pickup) {
				delivery.setSelected(false);
			}
			
			
			if (e.getSource() == exit) {
				System.exit(0);
			}
			if (e.getSource() == clear)	{
				small.setText("");
				medium.setText("");
				large.setText("");
				wings.setText("");
				breadsticks.setText("");
				bacon.setSelected(false);
				sausage.setSelected(false);
				pepperoni.setSelected(false);
				ham.setSelected(false);
				pineapple.setSelected(false);
				delivery.setSelected(false);
				pickup.setSelected(false);



				
			}
				
		
				
			double totalPrice = 0,tax = 0,finalPrice = 0, pizzas = 0;
			if (e.getSource() == order) {
				if(large.getText().equals("") == false){
					double largePizzas = Double.parseDouble(large.getText());
					pizzas += largePizzas;
					totalPrice += largePizzas * (double)LGPRICE;
				}
				if (medium.getText().equals("") == false){
					double mediumPizzas = Double.parseDouble(medium.getText());
					pizzas += mediumPizzas;
					totalPrice += mediumPizzas * (double)MDPRICE;
				}
				if (small.getText().equals("") == false){
					double smallPizzas = Double.parseDouble(small.getText());
					pizzas += smallPizzas;
					totalPrice += smallPizzas * (double)SMPRICE;
				}
				if(wings.getText().equals("") == false){
					double wingsNumber = Double.parseDouble(wings.getText());
					totalPrice += wingsNumber * (double)WGPRICE;
				}
				if(breadsticks.getText().equals("") == false){
					double breadsticksNumber = Double.parseDouble(breadsticks.getText());
					totalPrice += breadsticksNumber * (double)BDPRICE;
				}
				
			
				if (bacon.isSelected()){
					baconPrice = 1 * pizzas;
				}else{
					baconPrice = 0;
				}
				if (pepperoni.isSelected()){
					pepperoniPrice = 1 * pizzas;
				}else{
					pepperoniPrice = 0;
				}
				if (sausage.isSelected()){
					sausagePrice = 1 * pizzas;
				}else{
					sausagePrice = 0;
				}
				if (ham.isSelected()){
					hamPrice = 1 * pizzas;
				}else{
					hamPrice = 0;
				}
				if (pineapple.isSelected()){
					pineapplePrice = 1 * pizzas;
				}else{
					pineapplePrice = 0;
				}
				baconPrice  *= (double)TOPPINGPRICE ;
				pepperoniPrice  *= (double)TOPPINGPRICE;
				sausagePrice  *=(double) TOPPINGPRICE;
				hamPrice  *= (double)TOPPINGPRICE;
				pineapplePrice  *= (double)TOPPINGPRICE;
				if (delivery.isSelected()){
					totalPrice += 5;	
				}
				
				
				totalPrice += baconPrice + pepperoniPrice + sausagePrice + hamPrice + pineapplePrice;
				
				tax = totalPrice * TAX;
				finalPrice = totalPrice + tax;
				DecimalFormat round = new DecimalFormat("###,###.##");
				String taxR = round.format(tax);
				String totalR = round.format(finalPrice);
				JOptionPane.showMessageDialog(null,"Receipt\nThank You For Ordering with PizzaRUs\nSubtotal $"+ totalPrice + "\nTax $"+ taxR +"\nTotal $"+ totalR);
				
						
				
				
				
			}
			
		}
		//Constant - remember a number/word - can't change it
		//constant should be in ALL CAPS
		//final double SMPIZZA = 6.99
		//CASTING - temporarily changing  VARIABLE TO ANOTHER DATA TYPE 
		//(data type) in front of variable
		//double total =(SMPIZZA * (double)smordered

}
