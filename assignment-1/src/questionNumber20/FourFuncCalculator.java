package questionNumber20;
import java.util.Scanner;
public class FourFuncCalculator {

	public static void main(String[] args) {
		int x;
		int y;
		float output;
		char operator;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first number: ");
		x=sc.nextInt();
		System.out.print("Enter the second number: ");
		y=sc.nextInt();
		System.out.print("Enter the operator (+,-,*, or /): ");
		operator=sc.next().charAt(0);
		if(operator=='+') {
			output=x+y;
			System.out.println("-------------------------------------------");
			System.out.println("The addition of "+x+" and "+y+" is "+output);
		}
		else if(operator=='-') {
			output=x-y;
			System.out.println("-------------------------------------------");
			System.out.println("The subtraction of "+y+" from "+x+" is "+output);
		}
		else if(operator=='*') {
			output=x*y;
			System.out.println("-------------------------------------------");
			System.out.println("The multiplication of "+x+" and "+y+" is "+output);
		}
		else if(operator=='/') {
			output=(float)x/y;
			System.out.println("-------------------------------------------");
			System.out.println("The division of "+x+" by "+y+" is "+output);
		}
	}

}
