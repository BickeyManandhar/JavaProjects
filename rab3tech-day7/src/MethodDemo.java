import java.util.Scanner;

public class MethodDemo {
	//Method can be declared method before or after the main method
	static int sum(int num1, int num2) {
		int result=num1+num2;
		return result;
		
	}
	
	static int diff(int num1, int num2) {
		int result=num1-num2;
		return result;
		
	}
	
	static int mul(int num1, int num2) {
		int result=num1*num2;
		return result;
		
	}
	
	static float div(float num1, float num2) {
		float result=num1/num2;
		return result;
		
	}
	static float avg(float num1, float num2) {
		float result=num1+num2;
		return result/2;
		
	}
	
	static float temp() {
		//it is not taking any parameter but returning something
		float temperature=75.25f;
		return temperature;
	}
	
	static int factorial(int num1) {
		int result = 1;
		for(int i=1;i<=num1;i++) {
			result=result*i;//when input is 5, in first iteration: 1*1=1,second iteration: 1*2=2, 
							//third iteration: 2*3=6,fourth iteration: 6*4=24, fifth iteration: 24*5=120
		}
		return result;
		
	}
	
	static void end() {
		//This method does not take any parameter and does not return anything
		System.out.println(" ");
		System.out.println("-----------End of Program. -----------");
	}
	
	public static void main(String[] args) {
		//calling a method
		int input1;
		int input2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		input1=sc.nextInt();
		System.out.println("Enter second number: ");
		input2=sc.nextInt();
		
		System.out.println("The sum is "+sum(input1,input2));// calling sum()
		System.out.println("The difference is "+diff(input1,input2));// calling diff()
		System.out.println("The multiplication is "+mul(input1,input2));// calling mul()
		System.out.println("The division is "+div(input1,input2));// calling div()
		System.out.println("The average is "+avg(input1,input2));// calling avg()
		System.out.println("The factorial of first number is "+factorial(input1));
		System.out.println("-----------------------------------------------");
		System.out.println("The current temperature is "+temp()+" Fahrenheit.");// calling temp()
		
		end(); //calling end()

	}
	
}
