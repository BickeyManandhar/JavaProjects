package exceptionDemo;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started.");
		System.out.println("----------------------------");

		int num1 = 10;
		int num2 = 0;
		try {// we put suspicious code inside try block
			int div = num1 / num2; // Arithmetic exception here, so code below this will not get executed if this
									// is not handled
			System.out.println("Try block being executed and result is: " + div);
		}
		// catch block needs to be on priority basic, it will not work if we have
		// general exception block first and arithmetic exception block second
		catch (ArithmeticException e) {// catch block gets executed only if there is exception in try block
			System.out.println(
					"\nFirst catch block: Arithmetic Catch block being executed.\nReason of exception in brief: "
							+ e.getMessage());// it
			// will
			// provide
			// brief
			// information
			// about
			// exception
			System.out.println("Reason of exception in detail: ");
			e.printStackTrace();// detailed information about exception
		} catch (Exception e) {
			System.out
					.println("\nSecond catch block: General Catch Block being executed.\nReason of exception in brief: "
							+ e.getMessage());
			System.out.println("Reason of exception in detail: ");
			e.printStackTrace();
		}

		System.out.println("\nMain Method Ended. ");

	}

}
