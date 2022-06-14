
import java.util.Scanner;
public class FloatingNumbersMultiplication {

	public static void main(String[] args) {
		float num1;
		float num2;
		float num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1=sc.nextFloat();
		System.out.println("Enter the second number: ");
		num2=sc.nextFloat();
		num3=num1*num2;
		System.out.println("The result of multiplication of two entered float numbers:"+num3);
		

	}

}
