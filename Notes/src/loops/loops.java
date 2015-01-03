package loops;

import java.util.Random;
import java.util.Scanner;

public class loops {
	public static void main (String[] args){
		
		//for loops and while loops
		//for loops do stuff a specific amount if times
		for (int i = 0 ; i < 5; i++){
			// 3 pieces 
			//1 create counter
			//2 is condition when it runs
			//3 what happens ever time it loops
			System.out.println(i);
		}
		
		for (int j = 10; j >= 0; j--){
			System.out.println(j);
			
		}
		
		for (int k = 0; k <= 100; k+= 10){
			System.out.println(k);
		}
		
		int guess;
		int randomNum;
		 
		Random gen = new Random();
		
		randomNum = gen.nextInt(100)+1;
		
		Scanner rd = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("Enter Guess");
			guess = rd.nextInt();
			if (guess == randomNum){
				System.out.println("You Win!");
				run = false;
			}else if(randomNum < guess ) {
				System.out.println("too high");

			}else if (randomNum > guess){
				System.out.println("too low");

			}
			
			
		}
		
		
		
		
	}
}
