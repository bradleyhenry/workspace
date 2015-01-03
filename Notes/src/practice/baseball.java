package practice;

import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		int bat,hit;
		double average;
		Scanner rd = new Scanner(System.in);
		System.out.println("at bats and hits");
		bat = rd.nextInt();
		hit = rd.nextInt();
		average = hit/bat;
		if(average > .5)
			System.out.println("you hit more then half the time");
		
		
		
		//////////////////////////////////////////////////////////////////
		
		String first,last;
		System.out.println("type first,last");
		first = rd.next();
		last = rd.next();
		if (first.equalsIgnoreCase("Bradley") && last.equalsIgnoreCase("henry")){
			System.out.println("hello");
		}
		
		////////////////////////////////////////////////////////////
		
		
	}

}
