package questionNumber16;

import java.util.Scanner;

public class OddEvenChecker {
	static String oddeven(int a) {
		String even="It is even";
		String odd="It is odd";
		if(a%2==0) {
			return even;
		}
		else {
			return odd;
		}
	}
	public static void main(String[] args) {
		int  input1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		input1=sc.nextInt();
		System.out.println(oddeven(input1));

	}

}
