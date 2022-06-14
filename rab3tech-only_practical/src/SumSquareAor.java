import java.util.Scanner;

public class SumSquareAor {
	static int sum(int num1, int num2) {
		int result=num1+num2;
		return result;
		
	}
	static int square(int a) {
		return a*a;
	}
	static int aor(int l, int b) {
		return l*b;
	}
	static void end() {
		System.out.println("----------------- End of Program -----------------");
	}
	public static void main(String[] args) {
		int input1;
		int input2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to get its sum: ");
		System.out.println("Enter first number: ");
		input1=sc.nextInt();
		System.out.println("Enter second number: ");
		input2=sc.nextInt();
		System.out.println("The sum is "+sum(input1,input2));
		System.out.println("---------------------------------");
		int  input3;
		System.out.println("Enter a number to find its square: ");
		input3=sc.nextInt();
		System.out.println("The square of "+input3+" is "+square(input3));
		System.out.println("---------------------------------");
		int  input4;
		int input5;
		System.out.println("Enter length and breadth to find aread of rectangle: ");
		System.out.println("Enter length of rectangle: ");
		input4=sc.nextInt();
		System.out.println("Enter breadth of rectangle: ");
		input5=sc.nextInt();
		System.out.println("The area of rectangle of length "+input4+" and breadth "+input5+" is "+aor(input4,input5));
		System.out.println(" ");
		end();

	}

}
