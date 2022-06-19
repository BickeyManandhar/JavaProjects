package questionNumber3;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		int sum;
		int a;
		int b;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		a=sc.nextInt();
		System.out.println("Enter second number: ");
		b=sc.nextInt();
		sum=a+b;
		avg= (float)(a+b)/2;
		System.out.println("The sum of two numbers: "+sum);
		System.out.println("The average of two numbers: "+avg);
	}

}
