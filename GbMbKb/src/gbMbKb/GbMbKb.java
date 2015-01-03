 package gbMbKb;

import java.util.Scanner;

public class GbMbKb {
	
	public static void main(String[] args) {
	
		Scanner rd = new Scanner(System.in);
		double gb;
		System.out.println("Gb?  ");
		gb = rd.nextDouble();
		System.out.print("Kb=");
		System.out.println(gb*1000);
		System.out.print("Kb=");
		System.out.print(gb*1000000);
		
		
		
	}
}