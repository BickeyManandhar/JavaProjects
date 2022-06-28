package stringDemo;

import java.util.Scanner;

//equalsIgnoreCase() method demo
public class StringDemo2 {

	public static void main(String[] args) {
		String text;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		text = sc.nextLine();
		if (text.equalsIgnoreCase("bickey manandhar")) {// it is not case-sensitive. So, BICKEY MANANDHAR will count too
														// since they are of
														// same length and has same characters regardless of their
														// cases(Upper or lower).
			System.out.println("Your text matched the equalsIgnoreCase .");
		} else {
			System.out.println("Your text did not match the equalsIgnoreCase .");
		}

	}

}
