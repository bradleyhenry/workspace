package lbsOzKg;

import java.util.Scanner;

public class LbsOzKg {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		double lbs;
		System.out.println("Lbs?  ");
		lbs = rd.nextDouble();
		System.out.print("Ounces=");
		System.out.println(lbs*16);
		System.out.print("Kg=");
		System.out.print(lbs*.453592);
		
		
		
	}

}
