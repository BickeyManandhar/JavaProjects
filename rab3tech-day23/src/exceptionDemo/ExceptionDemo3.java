package exceptionDemo;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started.");
		System.out.println("----------------------------");

		int num1 = 10;
		int num2 = 0;
		try {// we put suspicious code inside try block
			int div = num1 / num2; // Arithmetic exception here, so code below this will not get executed if this
									// is not handled
			System.out.println("Try block being executed and result is: " + div);
		} catch (Exception e) {// catch block gets executed only if there is exception in try block
			System.out.println("\nCatch block being executed.\nReason of exception in brief: " + e.getMessage());// it
																													// will
																													// provide
																													// brief
																													// information
																													// about
																													// exception
			System.out.println("Reason of exception in detail: ");
			e.printStackTrace();// detailed information about exception
		}

		System.out.println("\nMain Method Ended. ");

	}

}
