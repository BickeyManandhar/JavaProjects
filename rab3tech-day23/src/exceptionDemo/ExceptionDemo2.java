package exceptionDemo;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started.");
		System.out.println("----------------------------");

		int num1 = 10;
		int num2 = 0;
		System.out.println("Before exception");
		int div = num1 / num2; // Arithmetic exception here, so code below this will not get executed if this
								// is not handled
		System.out.println("\nMain Method Ended. ");

	}

}
