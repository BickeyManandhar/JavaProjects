package exceptionDemo;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		try {
			if (name.equals("")) { // blank / no input
				Exception ex = new Exception("Sorry, name cannot be left blank. ");
				throw ex;// throw is used to throw an exception
			}
		} catch (Exception e) {// catch block gets executed only if we have exception
			e.printStackTrace();
			// System.out.println(e.getMessage());

			System.out.println("Catch Block being executed. ");
		}
		//outside the try and catch block
		if (name == "") {
			System.out.println("No name was provided. \n");
		} else {
			System.out.println("Name: " + name);
		}

	}

}
