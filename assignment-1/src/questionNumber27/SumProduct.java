package questionNumber27;

import java.util.Scanner;

public class SumProduct {

	public static void main(String[] args) {
		int x;
		int sum=0;
		int product=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find its sum and product of each digits: ");
		x=sc.nextInt();
		while(x!=0) {
			sum=(x%10)+sum;
			product=(x%10)*product;
			x=x/10;
		}
		System.out.println("The sum of each digits of given number is "+sum);
		System.out.println("The product of each digits of given number is "+product);

	}

}
