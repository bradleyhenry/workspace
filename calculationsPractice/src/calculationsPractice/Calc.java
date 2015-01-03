package calculationsPractice;
//Bradley Henry
import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		int eax=24493,ebx=8567,ecx=17707;
		System.out.println(((ebx+1)*eax)-ecx);
		
		
		Scanner rd = new Scanner(System.in);
		
		System.out.println("numbers go here");
		double num1,num2,sum,diff,pro,quo,avg,min,max;
		num1 = rd.nextDouble();
		num2 = rd.nextDouble();
		sum = num1 + num2;
		diff = num1 - num2;
		pro = num1 * num2;
		quo = num1 / num2;
		avg = (num1 + num2) / 2;
		min = Math.min(num1, num2);
		max = Math.max(num1, num2);
		
		for(int i = 0; i==0; i+=0){
		System.out.println("1.sum");
		System.out.println("2.Difference");	
		System.out.println("3.Product");	
		System.out.println("4.Quotient");	
		System.out.println("5.Average");	
		System.out.println("6.Min");	
		System.out.println("7.Max");	
		System.out.println("8.Quit");	
		int action = rd.nextInt();
		if (action == 1)
			System.out.println(sum);
		else if ( action == 2)
			System.out.println(diff);
		else if ( action == 3)
				System.out.println(pro);
		else if ( action == 4)
			System.out.println(quo);
		else if ( action == 5)
			System.out.println(avg);
		else if ( action == 6)
			System.out.println(min);
		else if ( action == 7)
			System.out.println(max);
		else if ( action == 8)
			break;		
		}
		
		
		
	}

}
