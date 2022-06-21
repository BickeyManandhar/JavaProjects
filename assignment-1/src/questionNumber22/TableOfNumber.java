package questionNumber22;

import java.util.Scanner;

public class TableOfNumber {
	static void table(int a) {
		for(int i=1;i<=10;i++) {
			System.out.print(a+" * "+i+" = ");
			System.out.println(a*i);
		}
	}
	public static void main(String[] args) {
		int  input1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to get its table: ");
		input1=sc.nextInt();
		table(input1);

	}

}
