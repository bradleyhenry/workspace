package arrayNotes;

import java.util.Scanner;

public class ArrayNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names={"first","middle","Last"};
		int[] scores = new int[20];
		double[] gpaEachYear = new double[4];
		Scanner rd = new Scanner(System.in);
		
		//fill up scores array
		for (int i = 0; i<20; i++) {
			System.out.println("enter points for each game" + (i+1));
			scores[i] = rd.nextInt();
		}
		
		//fill up names
		for (int i=0; i<names.length;i++){
			System.out.print(names[i] + "  ");
		}
		
	
	}
	

}
