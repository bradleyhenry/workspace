package io;
//Bradley Henry
import java.util.Scanner;

public class Io {

	public static void main(String[] args) {
	
	//variables different data types
	String name = "bradley";    //String = word(s)
	
	System.out.print("what is your name?  ");
	//use a scanner to get user input
	//scanner named rd or whatever i put after scanner 
	Scanner rd = new Scanner(System.in);
	name = rd.nextLine();
	//rd gets the input and stores it in name
	
	System.out.print("Hello ");
	System.out.println(name);
	
	
	//next data type is integer
	int age; 
	
	System.out.print("how old are you?  ");
	age = rd.nextInt();
	
	int yearsLeft = 65 - age;
	System.out.print("you have   ");
	System.out.print(yearsLeft);
	System.out.println("  years left untill retirement!  ");
	
	//next data type is double (decimal)
	
	double numCats;
	System.out.println("how many cats do you have?  ");
	numCats = rd.nextDouble();
	System.out.println("you own"+ numCats + "cats!");
	
	double legs = numCats * 4;
	System.out.println("you have"+legs+"cat legs!");
	
	
	
	}
	

}
