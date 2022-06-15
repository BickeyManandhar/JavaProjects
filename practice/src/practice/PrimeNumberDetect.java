package practice;

import java.util.Scanner;

public class PrimeNumberDetect {
static void isPrime(int num) {
	if(num==1 || num==2) {
		System.out.println("It is a prime number.");
	}
	else if(((num*num)-1)%2!=0) {
		System.out.println("It is not a prime number.");
	}
	else if(num%2!=0 || num%3!=0) {
		System.out.println("It is a prime number.");
	}
	
	else {
		System.out.println("It is not a prime number.");
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
