package questionNumber9;

import java.util.Scanner;

public class PoundsToKgs {

	public static void main(String[] args) {
		double input;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of pounds: ");
		input=sc.nextDouble();
		double kg=input*0.45;
		System.out.println("The number of kgs based on given input is "+kg+ " kgs.");
	}

}
