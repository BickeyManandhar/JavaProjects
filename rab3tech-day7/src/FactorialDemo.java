import java.util.Scanner;

public class FactorialDemo {
	
	static int factorial(int num1) {
		int result = 1;
		for(int i=1;i<=num1;i++) {
			result=result*i;//if input is 6, in first iteration: 1*1=1,second iteration: 1*2=2, 
							//third iteration: 2*3=6,fourth iteration: 6*4=24, fifth iteration: 24*5=120, sixth iteration: 120*6=70 and end of iteration
		}
		return result;
		
	}

	public static void main(String[] args) {
		int input1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find its factorial: ");
		input1=sc.nextInt();
		System.out.println("The factorial of "+input1+ ": "+factorial(input1));

	}

}
