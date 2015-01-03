package warmup;

import java.util.Scanner;

public class month {

	public static void main(String[] args) {
		
		Scanner rd = new Scanner(System.in);
		System.out.println("month");
		String month;
		month = rd.nextLine();
		
		if (month.equals("january") || month.equals("march") || month.equals("may") || month.equals("july") || month.equals("august") || month.equals("october") || month.equals("december")){
			System.out.println("31");
		}else if(month.equals("febuary")){
		  	System.out.println("28");
	    }else{
	    	System.out.println("30");
	    }

	
	
	String name,password;
	
	System.out.println("type username and password");
	name = rd.nextLine();
	password = rd.nextLine();
	
	if (name.equalsIgnoreCase("username")){
		if(password.equals("cookies")){
			System.out.println("your in");
		}else {
				System.out.println("error");
			}
			
			}else {
				System.out.println("error");
			}
	
	double number;
	System.out .println("num");
	number = rd.nextDouble();
	 if (number % 2 == 0)
		 System.out.println("even");
	 else 
		 System.out.println("odd");
	 
	
	
	
	
	}

}
