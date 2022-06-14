import java.util.Scanner;

public class sum {
	static int sum(int num1, int num2) {
		int result=num1+num2;
		return result;
		
	}
	public static void main(String[] args) {
		int input1;
		int input2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		input1=sc.nextInt();
		System.out.println("Enter second number: ");
		input2=sc.nextInt();
		System.out.println("The sum is "+sum(input1,input2));

	}

}
