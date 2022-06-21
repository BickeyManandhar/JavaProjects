package questionNumber21;
import java.util.Scanner;
public class NumberEquDay {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a number to see its corresponding day: ");
		n=sc.nextInt();
		if(n==1) {
			System.out.println("It is Sunday.");
		}
		else if(n==2) {
			System.out.println("It is Monday.");
		}
		else if(n==3) {
			System.out.println("It is Tuesday.");
		}
		else if(n==4) {
			System.out.println("It is Wednesday.");
		}
		else if(n==5) {
			System.out.println("It is Thursday.");
		}
		else if(n==6) {
			System.out.println("It is Friday.");
		}
		else if(n==7) {
			System.out.println("It is Saturday.");
		}
		else {
			System.out.println("Invalid input. Week cannot have '0' or more than 7 days.");
		}

	}

}
