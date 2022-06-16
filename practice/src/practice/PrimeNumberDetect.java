package practice;

import java.util.Scanner;

public class PrimeNumberDetect {
static void isPrime(int num) {
	if(num==1 || num==2) {
		System.out.println("It is a prime number.");
	}

	
}
	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.print("Enter a number: ");
		number=sc.nextInt();	
		isPrime(number);
		}

	}

}
