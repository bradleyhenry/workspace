package easyio;
//Bradley Henry
import java.util.Scanner;
public class fahrenheitToCelsius {	

	public static void main(String[] args) {
	Scanner rd = new Scanner(System.in);
	double F;
	double x;
	double y;
	
	System.out.println("this program will convert fahrenheit to celsius");
	System.out.println("Fahrenheit?");
	F = rd.nextDouble();
	System.out.print("Celsius=");
	x = F-32;
	y = x*5;
	System.out.print(y/9);
	

	}

}
