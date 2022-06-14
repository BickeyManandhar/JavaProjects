import java.util.Scanner;

public class EvenOddChecker {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("It is even number.");
		}
		else {
			System.out.println("It is odd number.");
		}

	}

}
