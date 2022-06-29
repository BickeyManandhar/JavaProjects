package exceptionDemo;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started.");
		System.out.println("----------------------------");
		System.out.println("For loop starts. \n");
		for (int i = 0; i <= 5; i++) {
			System.out.println("Rab3Tech");
		}
		System.out.println("\nFor loop ends. ");
		System.out.println("----------------------------");
		int x = 5;
		int y = 0;
		int div = x / y; // Arithmetic exception here, so code below this will not get executed if this
							// is not handled
		System.out.println(div);
		System.out.println("Main Method Ended. ");

	}

}
