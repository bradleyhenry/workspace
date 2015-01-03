package easyio;
//Bradley Herny
import java.util.Scanner;

public class feetToMiles {

	public static void main(String[] args) {
	
	Scanner rd = new Scanner(System.in);
	double feet;
	double miles;
	
	System.out.println("this program will convert miles to feet and feet to miles. ");
	System.out.println("miles?  ");
	miles = rd.nextDouble();
	
	System.out.print("feet=");
	System.out.println(miles*5280);
	
	System.out.println("feet?  ");
	feet = rd.nextDouble();
	
	System.out.print("mile(s)=");
	System.out.print(feet/5280);
	

	}

}
