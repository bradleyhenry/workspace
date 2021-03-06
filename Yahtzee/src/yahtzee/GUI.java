package yahtzee;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.*;

public class  GUI implements MouseListener{
	
	JFrame window = new JFrame("Yahtzee");
	JPanel mainPanel = new JPanel(new BorderLayout());
	JPanel north = new JPanel();//unused
	JPanel south = new JPanel();//unused
	JPanel west = new JPanel(new GridLayout(19,2,2,2));//score
	JPanel east = new JPanel();//unused
	JPanel center = new JPanel(new GridLayout(2,1)); //roll button and dice
	JPanel centerTop = new JPanel(new GridLayout(5,2));
	JPanel centerBottom = new JPanel();
	
	
	//use to assign button names
	String[] buttonNames={"one","Two","Three","Four","Five","Six","Top Subtotal","Bounus","Top Total","Three of a Kind","Four of a Kind","Full House","Small Straight","Large Straight","Chance","Yahtzee","Top Total","Bottom Total","Total"};
	JButton[] buttons = new JButton[19];
	JLabel[] scoreArea = new JLabel[19];
	int[] score = new int[19];
	boolean[] scoreUsed = new boolean[19];
	
	JButton rollButton = new JButton("Roll");
	
	
	
	//dice
	JLabel[] dice = new JLabel[5];
	JButton[] diceButton = new JButton[5];
	int[] diceValue = new int[5];
	//int[] diceValue = {1,2,2,3,4};	//use for testing---------------------------------------------
	boolean[] diceBoolean =new boolean[5];//if true hold if false play
	
	
	public GUI() {
		
		//east panel
		for(int i = 0; i<=18;i++){
			buttons[i] = new JButton(buttonNames[i]);
			buttons[i].addMouseListener(this);
			buttons[i].setEnabled(true);
			scoreArea[i] = new JLabel();
			west.add(buttons[i]);
			west.add(scoreArea[i]);
			scoreArea[i].setOpaque(true);
			scoreArea[i].setBackground(Color.RED);
		}
		//north panel
		for(int i=0;i<=4;i++){
			dice[i] = new JLabel();
			diceButton[i] = new JButton("playing");
			diceButton[i].addMouseListener(this);
			centerTop.add(dice[i]);
			centerTop.add(diceButton[i]);
			dice[i].setOpaque(true);
			dice[i].setBackground(Color.black);
		}
		//total scores don't need a button so disable
		buttons[6].setEnabled(false);
		scoreUsed[6] = true;
		buttons[7].setEnabled(false);
		scoreUsed[7] = true;
		buttons[8].setEnabled(false);
		scoreUsed[8] = true;
		buttons[16].setEnabled(false);
		scoreUsed[16] = true;
		buttons[17].setEnabled(false);
		scoreUsed[17] = true;
		buttons[18].setEnabled(false);
		scoreUsed[18] = true;
		
		mainPanel.add(BorderLayout.EAST,east);
		mainPanel.add(BorderLayout.NORTH,north);
		mainPanel.add(BorderLayout.SOUTH,south);
		mainPanel.add(BorderLayout.WEST,west);
		mainPanel.add(BorderLayout.CENTER,center);
		mainPanel.setBackground(Color.black);
		center.add(centerTop);
		centerTop.setBackground(Color.BLACK);
		center.add(centerBottom);
		centerBottom.setBackground(Color.BLACK);
		
		centerBottom.add(rollButton);
		rollButton.addMouseListener(this);
		
		window.add(mainPanel);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	
		
		
		
		
	
	}
	int turn = 1;
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		//rolling button
		if(e.getSource() == rollButton){
			

			if(turn<=3){
				roll();
				System.out.println(turn);
				turn++;
			}else{
		 		rollButton.setEnabled(false);
		 		//rollButton.removeMouseListener(this);
		 		System.out.println("listener removed");
		 	}
			for(int i = 0;i<=18;i++){
				if(buttons[i].getMouseListeners() !=null && !scoreUsed[i]){
					//buttons[i].addMouseListener(this);
					buttons[i].setEnabled(true);
				}
			}
		}
		//hold buttons
		holding(e);
	
		//1 to 6 scoring
		if(e.getSource() == buttons[0] && buttons[0].isEnabled()){
			scoreArea[0].setText(Integer.toString(one()));
			score[0] = one();
			scoreUsed[0] = true;
			buttons[0].setEnabled(false);
			//buttons[0].removeMouseListener(this);
			turn = 1;
			reset();
			update();
		}
		if(e.getSource() == buttons[1]&& buttons[1].isEnabled()){
			scoreArea[1].setText(Integer.toString(two()));
			score[1] = two();
			scoreUsed[1] = true;
			buttons[1].setEnabled(false);
			//buttons[1].removeMouseListener(this);
			turn = 1;
			reset();
			update();
		}
		if(e.getSource() == buttons[2]&& buttons[2].isEnabled()){
			scoreArea[2].setText(Integer.toString(three()));
			score[2] = three();
			scoreUsed[2] = true;
			buttons[2].setEnabled(false);
			//buttons[2].removeMouseListener(this);
			turn = 1;
			reset();
			update();
		}	
		if(e.getSource() == buttons[3]&& buttons[3].isEnabled()){
			scoreArea[3].setText(Integer.toString(four()));
			score[3] = four();
			scoreUsed[3] = true;
			buttons[3].setEnabled(false);
			//buttons[3].removeMouseListener(this);
			turn = 1;
			reset();
			update();
		}
		if(e.getSource() == buttons[4]&& buttons[4].isEnabled()){
			scoreArea[4].setText(Integer.toString(five()));
			score[4] = five();
			scoreUsed[4] = true;
			buttons[4].setEnabled(false);
			//buttons[4].removeMouseListener(this);
			turn = 1;
			reset();
			update();
		}
		if(e.getSource() == buttons[5]&& buttons[5].isEnabled()){
			scoreArea[5].setText(Integer.toString(six()));
			score[5] = six();
			scoreUsed[5] = true;
			buttons[5].setEnabled(false);
			//buttons[5].removeMouseListener(this);
			turn = 1;
			reset();
			update();
		}
		///////// three of a kind
		if(e.getSource() == buttons[9]&& buttons[9].isEnabled()){			
			int threeOfAKindScore = 0;
			if(threeOfAKind()){
	
				for(int i = 0; i<=4;i++){
					threeOfAKindScore += diceValue[i];
				}
			}
			scoreArea[9].setText(Integer.toString(threeOfAKindScore));
			score[9] = threeOfAKindScore;
			scoreUsed[9] = true;
			buttons[9].setEnabled(false);
			//buttons[9].removeMouseListener(this);
			turn = 1;
			reset();
			
			update();	
			
		}
		///////////four of a kind
		if(e.getSource() == buttons[10]&& buttons[10].isEnabled()){			
			int fourOfAKindScore = 0;
			if(fourOfAKind()){
	
				for(int i = 0; i<=4;i++){
					fourOfAKindScore += diceValue[i];
				}
			}
			scoreArea[10].setText(Integer.toString(fourOfAKindScore));
			score[10] = fourOfAKindScore;
			buttons[10].setEnabled(false);
			scoreUsed[10] = true;
			//buttons[10].removeMouseListener(this);
			turn = 1;
			reset();
			
			update();	
			
		}
		/////////////////////full house
		if(e.getSource() == buttons[11]&& buttons[11].isEnabled()){
			if(fullHouse()){
				scoreArea[11].setText("25");
				score[11] = 25;
			}else
				scoreArea[11].setText("0");
			buttons[11].setEnabled(false);
			scoreUsed[11] = true;
			//buttons[11].removeMouseListener(this);
			turn = 1;
			reset();
			update();
		}
		/////////////////////////small straight
		if(e.getSource() == buttons[12]&& buttons[12].isEnabled()){
			System.out.println("this works");
			if(smStraight()){
				scoreArea[12].setText("30");
				score[12] = 30;	
			}else if(lgStraight()){
				scoreArea[12].setText("30");
				score[12] = 30;	
			}
			else
				scoreArea[12].setText("0");
			buttons[12].setEnabled(false);
			scoreUsed[12] = true;
			//buttons[12].removeMouseListener(this);
			turn = 1;
			reset();
			update();
		}
		//////////////////////////Large straight
		if(e.getSource() == buttons[13]&& buttons[13].isEnabled()){
			System.out.println("this works");
			if(lgStraight()){
				scoreArea[13].setText("40");
				score[13] = 40;
			}else 
				scoreArea[13].setText("0");
			buttons[13].setEnabled(false);
			scoreUsed[13] = true;
			//buttons[13].removeMouseListener(this);
			turn = 1;
			reset();
			update();
		}
		/////////////////////////////////chance 
		if(e.getSource() == buttons[14]&& buttons[14].isEnabled()){
			scoreArea[14].setText(Integer.toString(chance()));
			score[14] = chance();
			scoreUsed[14] = true;
			buttons[14].setEnabled(false);
			//buttons[14].removeMouseListener(this);
			turn = 1;
			reset();
			update();
		}
		if(e.getSource() == buttons[15]&& buttons[15].isEnabled()){
			System.out.println("this works");
			if(yahtzee()){
				scoreArea[15].setText("50");
				score[15] = 50;
			}else 
				scoreArea[15].setText("0");
			buttons[15].setEnabled(false);
			scoreUsed[15] = true;
			buttons[15].removeMouseListener(this);
			turn = 1;
			reset();
			update();
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//restrict rolling 
		//rollButton.setEnabled(false); ---- only looks disabled
		//rollButton.removeMouseListener(this);
		//do opposite to add it back
	
	
	//Arrays.sort(nameofArray);
	
	//MY METHODS
	public void roll() {
		Random gen = new Random();
		for(int i = 0; i <= 4;i++){
			if(!diceBoolean[i]){
				int newNumber = gen.nextInt(6) + 1;
			dice[i].setIcon(new ImageIcon("src//images//"+newNumber+".png"));
			diceValue[i] = newNumber;
			
			}
			
		
			
		}
			
	}
	public void holding(MouseEvent e) {
		for(int i = 0; i<=4;i++){	
			if(e.getSource() == diceButton[i]){
				diceBoolean[i] = !diceBoolean[i];
				if(diceBoolean[i]){
					diceButton[i].setText("holding");
				}else if (!diceBoolean[i]){
					diceButton[i].setText("playing");
				}
			}
		}
	}
	public int one() {
		int score = 0;
		for(int i = 0;i<=4;i++){
			if(diceValue[i] == 1)
				score++;
		}
		return score;
	}
	public int two() {
		int score = 0;
		for(int i = 0;i<=4;i++){
			if(diceValue[i] == 2)
				score+=2;
		}
		return score;
	}
	public int three() {
		int score = 0;
		for(int i = 0;i<=4;i++){
			if(diceValue[i] == 3)
				score+=3;
		}
		return score;
	}	
	public int four() {
		int score = 0;
		for(int i = 0;i<=4;i++){
			if(diceValue[i] == 4)
				score+=4;
		}
		return score;
	}
	public int five() {
		int score = 0;
		for(int i = 0;i<=4;i++){
			if(diceValue[i] == 5)
				score+=5;
		}
		return score;
	}
	public int six() {
		int score = 0;
		for(int i = 0;i<=4;i++){
			if(diceValue[i] == 6)
				score+=6;
		}
		return score;
	}
	public boolean threeOfAKind() {
		int value = 0;
		for(int i = 6; i>0 ; i--){
			for(int j = 4; j>=0;j--){
				if(diceValue[j] == i){
					 value++;
				}
			}
			if(value>= 3){
				return true;
			}else{
				value = 0;
			}
					
			
		}
		return false;
	}
	
	public boolean fourOfAKind() {
		int value = 0;
		for(int i = 6; i>0 ; i--){
			for(int j = 4; j>=0;j--){
				if(diceValue[j] == i){
					 value++;
				}
			}
			if(value>= 4){
				return true;
			}else{
				value = 0;
			}
					
			
		}
		return false;
	}
	public boolean fullHouse(){
		Arrays.sort(diceValue);
		if(((diceValue[0] == diceValue[1]) && (diceValue[2] == diceValue[3]) && (diceValue[3] == diceValue[4])) && diceValue[0] != 0  && diceValue[1] != 0  && diceValue[2] != 0  && diceValue[3] != 0  && diceValue[4] != 0 || (diceValue[0] == diceValue[1]) && (diceValue[1] == diceValue[2]) && (diceValue[3] == diceValue[4])  && diceValue[0] != 0 && diceValue[1] != 0 && diceValue[2] != 0 && diceValue[3] != 0 && diceValue[4] != 0)
			return true;
		else
			return false;
	}
	public boolean smStraight(){
		//Arrays.sort(diceValue);
		int[] number = new int [6];
		for(int i = 0; i <= 4;i++){
			for (int j = 0; j <= 5;j++){
				if(diceValue[i]==(j+1)){
					number[j]++;
				}
			}
		}
		for (int k = 0; k <= 5;k++){
			System.out.println(number[k]);
		}
		if(number[0]!=0 && number[1]!=0 && number[2]!=0 && number[3]!=0)
			return true;
		else if(number[1]!=0 && number[2]!=0 && number[3]!=0 && number[4]!=0)
			return true;
		else if(number[2]!=0 && number[3]!=0 && number[4]!=0 && number[5]!=0)
			return true;
		else 
			return false;
	}	
		
	public boolean lgStraight(){
		Arrays.sort(diceValue);
		if(diceValue[0]<diceValue[1] && diceValue[1]<diceValue[2] && diceValue[2]<diceValue[3] && diceValue[3]<diceValue[4])
			return true;
		else
			return false;
	}
	public int chance(){
		int score = 0;
		for(int i = 0; i<=4;i++)
			score+=diceValue[i];
		return score;	
			
	}
	public boolean yahtzee(){
		if((diceValue[0]==diceValue[1])&&(diceValue[1]==diceValue[2])&&(diceValue[2]==diceValue[3])&&(diceValue[3]==diceValue[4])&&(diceValue[0]!=0))
			return true;
		else 
			return false;
	}
	public void update(){
		// add top score
		for(int i = 0; i<=5;i++){
			score[6] += score[i];
		}
		//bonus
		if(score[6]>=63)
			score[7] = 35;
		score[8] = score[6] + score[7];
		//bottom score
		for (int j = 9; j<=15;j++){
			score[17]+=score[j];
		}
		//subtotal
		score[16]=score[8];
		//total
		score[18]= score[16] + score[17];
		//put score in box
		scoreArea[6].setText(Integer.toString(score[6]));
		scoreArea[7].setText(Integer.toString(score[7]));
		scoreArea[8].setText(Integer.toString(score[8]));
		scoreArea[16].setText(Integer.toString(score[16]));
		scoreArea[17].setText(Integer.toString(score[17]));
		scoreArea[18].setText(Integer.toString(score[18]));
		//mainPanel.updateUI();
		score[6] = 0;
		score[7] = 0;
		score[8] = 0;
		score[16] = 0;
		score[17] = 0;
		score[18] = 0;
		
	}
	
	public void reset(){
		if(rollButton.getMouseListeners() !=null){
			//rollButton.addMouseListener(this);
			rollButton.setEnabled(true);
			System.out.println("listener added");
		}
		for(int i = 0; i<=4;i++){
			diceButton[i].setText("playing");
			diceBoolean[i] = false;
		}
		for(int i = 0; i<19;i++){
			buttons[i].setEnabled(false);
			//buttons[i].removeMouseListener(this);
			
		}
	}
}
