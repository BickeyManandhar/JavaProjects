package exceptionDemo;

import java.util.Scanner;

public class ExceptionDemoFinally {

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
			int result = x / y;
			if (result == 2) {
				return;// if result is 2 then catch blocks will be skipped but finally block will still
						// be executed
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
