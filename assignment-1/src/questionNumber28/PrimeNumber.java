package questionNumber28;

import java.util.Scanner;
//a)
public class PrimeNumber {
	static boolean isPrimenumber(int n) {//lets say n=11
		if(n<=1) {//11<=1?? No so skip
		return false;
		}
		for(int i=2;i<=n/2;i++) {         //i) 2<=11/2??yes so enter the loop, 11%2==0? No.
			if((n%i)==0) {				//ii) 3<=11/3?? yes so enter the loop, 11%3==0? No.
				return false;			// iii) 4<=11/4?? no so exit the loop.
			}							
				
		}
		return true;//finally return true
	}
	
	//b)
	static void firstNthPrime(int a) {
		for(int i=2;i<=a;i++) {
			if(isPrimenumber(i)==true) {
				System.out.println(i);
			}
		}
	}
	
	//c)
	static void allPrimebetween(int start, int end) {
		for(int i=start;i<=end;i++) {
			if(isPrimenumber(i)==true) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		int n;
		int p;
		int x;
		int y;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to find if it is prime number or not: ");
		n=sc.nextInt();
		if(isPrimenumber(n)==true) {
			System.out.println("It is a prime number.");
		}
		else {
			System.out.println("It is not a prime number.");
		}
		System.out.println("------------------------------------------------------------------");
		System.out.print("Enter a number up to which you want to view the prime numbers: ");
		p=sc.nextInt();
		System.out.println("The list of prime numbers up to "+p+" are:");
		firstNthPrime(p);
		System.out.println("------------------------------------------------------------------");
		System.out.print("Enter a start number to find prime numbers in between: ");
		x=sc.nextInt();
		System.out.print("Enter a end number to find prime numbers in between: ");
		y=sc.nextInt();
		System.out.println("The list of prime numbers in between "+x+" and"+y+" are: ");
		allPrimebetween(x,y);
	}

}
