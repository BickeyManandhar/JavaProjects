package supriseTest;
import java.util.Scanner;

public class InputProduct {
	public float mul(float x, float y) {
		return x*y;
	}

	public static void main(String[] args) {
		float num1;
		float num2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num1=sc.nextFloat();
		System.out.print("Enter the second number: ");
		num2=sc.nextFloat();
		InputProduct ip=new InputProduct();
		System.out.println("The result of multiplication of two given numbers: "+ ip.mul(num1,num2));
		

	}

}
