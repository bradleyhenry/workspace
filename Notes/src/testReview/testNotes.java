package testReview;
import java.util.Scanner;
public class testNotes {

	public static void main(String[] args) {
	//notes for test on 10/16/14
		double anwser;
		
		//scanner
		Scanner rd = new Scanner(System.in);
	int x;
	double y;
	String z;
	
	System.out.println("ask stuffff");
	x = rd.nextInt();
	y = rd.nextDouble();
	z = rd.nextLine();
	
	//var and constant
		//know int double and String
	final double SALESTAX = .06;

	
	//casting
	anwser = (double)x*y;
	
	//MATH
	//alllll math returns a double!
	y = Math.max(1, 2);
	y = Math.min(1, 2);
	y = Math.PI;
	y = Math.pow(1,1);
	
	//MODULUS
	//get remainder
	int remainder = 100%3;
	
	int num = 0;
	if(num%3==0)
		System.out.println("yes");
	else
		System.out.println("no");
	
	
	
	
	
	
	}
}