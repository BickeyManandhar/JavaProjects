package exceptionDemo;

import java.util.Scanner;

public class ExceptionDemoFinally2 {

	public static void main(String[] args) {
		System.out.println("Main method started. ");
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numerator: ");
		x = sc.nextInt();
		System.out.print("Enter a denomenator: ");
		y = sc.nextInt();
		try {
			int result = x / y;// suspicious code
			if (result == 2) {
				System.out.println("Here result is 2, so, finally block is not executed in this case only.");
				System.exit(0);//only in this case finally block will not be executed when program is terminated.
				return;
			}
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Catch block being executed.");
			System.out.println("Brief reason: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("General Exception Catch block.");
		} finally {
			System.out.println("Finally block being executed.");
		}
		System.out.println("End of Main Method.");
	}

}
4