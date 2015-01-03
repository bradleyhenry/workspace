package makingChange;
import java.util.Scanner;
public class MakingChange {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		double bill, change,remainder;
		int count = 0;
		System.out.println("Bill and Change");
		bill = rd.nextDouble();
		change = rd.nextDouble();
		remainder = change - bill;
		if (remainder>= 20){
			count = (int)(remainder / 20);
			System.out.println(count + "twenties");
			remainder = remainder - (count * 20);	
		}
		if (remainder >= 10){
			count = (int)(remainder / 10);
			System.out.println(count + "tens");
			remainder = remainder - (count * 20) ;	
		}
		if (remainder >= 5){
			count = (int)(remainder / 5);
			System.out.println(count + "fives");
			remainder = remainder - (count * 5) ;	
		}
		if (remainder >= 1){
			count = (int)(remainder / 1);
			System.out.println(count + "ones");
			remainder = remainder - (count * 1);	
		}
		if (remainder >= .25){
			count = (int)(remainder / .25);
			System.out.println(count + "quarters");
			remainder =  remainder - (count * .25);	
		}
		if (remainder >= .10){
			count = (int)(remainder / .10);
			System.out.println(count + "dimes");
			remainder =  remainder - (count * .10);	
		}
		if (remainder >= .05){
			count = (int)(remainder / .05);
			System.out.println(count + "nickels");
			remainder = remainder - (count * .05);	
		}
		if (remainder >= .01){
			count = (int)(remainder / .01);
			System.out.println(count + "pennies");
			remainder = remainder - (count * .01);	
		}
	}
	
	

}
