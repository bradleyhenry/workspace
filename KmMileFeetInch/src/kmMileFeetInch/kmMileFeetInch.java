package kmMileFeetInch;

import java.util.Scanner;

public class kmMileFeetInch {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		double km,feet;
		System.out.println("Km?  ");
		km = rd.nextDouble();
		System.out.print("miles=");
		System.out.println(km*0.621371192);
		
		System.out.println("feet?  ");
		feet = rd.nextDouble();
		System.out.print("inch=");
		System.out.print(feet*12);
		
		
		

	}

}
