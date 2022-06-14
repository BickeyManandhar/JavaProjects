import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		float num1;
		float num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1=sc.nextFloat();
		System.out.println("Enter the first number: ");
		num2=sc.nextFloat();
		float add=num1+num2;
		float sub=num1-num2;
		float mul=num1*num2;
		float div=(float)num1/num2;
		float mod=num1%num2;
		
		System.out.println("Here num1: "+num1+" and num2: "+num2);
		System.out.println("");
		System.out.println("Sum of num1 and num2 is: " + add);
		System.out.println("------------------------------------------------------");
		System.out.println("Difference of num2 from num2 is: " + sub);
		System.out.println("------------------------------------------------------");
		System.out.println("Multiplication of num1 and num2 is: " + mul);
		System.out.println("------------------------------------------------------");
		System.out.println("The division of num1 from num2 is: " + div);
		System.out.println("------------------------------------------------------");
		System.out.println("Modulous of num1 and num2 is: " + mod);
		System.out.println("------------------------------------------------------");

	}

}
