import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		int age;
		String fullname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Full name: ");
		fullname=sc.nextLine();
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		if(age<18) {
			System.out.println("Sorry you are not eligible to vote.");
		}
		else {
			System.out.println("Hi "+fullname+" you are eligible to vote.");
		}

	}

}
