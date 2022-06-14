import java.util.Scanner;

public class TableFactorialOddEven {
	static void table(int a) {
		for(int i=1;i<=10;i++) {
			System.out.print(a+" * "+i+" = ");
			System.out.println(a*i);
		}
	}
	static int factorial(int num1) {
		int result = 1;
		for(int i=1;i<=num1;i++) {
			result=result*i;//if input is 6, in first iteration: 1*1=1,second iteration: 1*2=2, 
							//third iteration: 2*3=6,fourth iteration: 6*4=24, fifth iteration: 24*5=120, sixth iteration: 120*6=70 and end of iteration
		}
		return result;
		
	}
	static String oddeven(int a) {
		String even="It is even";
		String odd="It is odd";
		if(a%2==0) {
			return even;
		}
		else {
			return odd;
		}
	}
	static void end() {
		System.out.println("----------- End of Program -----------");
	}
	
	public static void main(String[] args) {
		int  input1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to get its table: ");
		input1=sc.nextInt();
		table(input1);
		System.out.println("--------------------------------------");
		int input2;
		System.out.println("Enter a number to find its factorial: ");
		input2=sc.nextInt();
		System.out.println("The factorial of "+input2+ ": "+factorial(input2));
		System.out.println("--------------------------------------");
		int  input3;
		System.out.println("Enter a number to find if its odd or even: ");
		input3=sc.nextInt();
		System.out.println(oddeven(input3));
		end();

	}

}
