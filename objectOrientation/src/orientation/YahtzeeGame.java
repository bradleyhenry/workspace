package orientation;

public class YahtzeeGame {
	private int[] topScores = new int[6];
	private int[] bottomScores = new int[7];
	private int topTotal;
	private int bottomTotal;
	private int bonus;
	
	//construtor for new game
	
	public YahtzeeGame () {
		for (int i = 0; i< topScores.length; i++){
			topScores[i] = 0;
		}
		for(int i = 0; i<bottomScores.length; i++){
			bottomScores[i] = 0;
		}
		topTotal = 0; 
		bottomTotal = 0;
		bonus = 0;
	}
	public YahtzeeGame(String sameName){
		
	}
	public int[] getTopScores() {
		return topScores;
	}
	public void setTopScores(int[] topScores) {
		this.topScores = topScores;
	}
	public int[] getBottomScores() {
		return bottomScores;
	}
	public void setBottomScores(int[] bottomScores) {
		this.bottomScores = bottomScores;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getTopTotal() {
		return topTotal;
	}
	public int getBottomTotal() {
		return bottomTotal;
	}

//scoring methods 
	//int() use parametors to bring over dice from gui class
	public int topScore(int[]dice,int number){
		int score = 0;
		for(int i = 0; i<dice.length;i++){
			if(dice[i] == number)
				score += number;
		}
		topScores[number - 1] = score;
		return score;
	}
	public int totaling(){
		int top = getTopTotal();
		int bottom = getBottomtotal();
		if(top >= 65){
			int bonus = 
		}
		
	}

}

