package easyio;
//Bradley Henry
import java.util.Scanner;

public class Scheduler {

	public static void main(String[] args) {
	
	Scanner rd = new Scanner(System.in);
	String class1;
	String class2;
	String class3;
	String class4;
	String t1;
	String t2;
	String t3;
	String t4;
	
	
	System.out.print("What is your first class?  ");
	class1 = rd.nextLine();
	
	System.out.println();
	
	System.out.print("who is that teacher?  ");
	t1 = rd.nextLine();
	
	System.out.println();
	
	System.out.print("what is your second class?  ");
	class2 = rd.nextLine();
	
	System.out.println();
	
	System.out.print("who is that teacher?  ");
	t2 = rd.nextLine();
	
	System.out.println();
	
	System.out.print("what is your third class?  ");
	class3 =rd.nextLine();
	
	System.out.println();
	
	System.out.print("who is that teacher?  ");
	t3 = rd.nextLine();
	
	System.out.println();
	
	System.out.print("what is your fourth class?  ");
	class4 = rd.nextLine();
	
	System.out.println();
	
	System.out.print("who is that teacher?  ");
	t4 = rd.nextLine();
	
	System.out.println();
	
	
	System.out.println("your schedule is as follows");
	System.out.print(class1);
	System.out.print("\t");
	System.out.println(t1);
	System.out.print(class2);
	System.out.print("\t");
	System.out.println(t2);
	System.out.print(class3);
	System.out.print("\t");
	System.out.println(t3);
	System.out.print(class4);
	System.out.print("\t");
	System.out.println(t4);

	}

}
