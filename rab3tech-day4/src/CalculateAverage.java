import java.util.Scanner;

public class CalculateAverage {

	public static void main(String[] args) {
		float num1;
		float num2;
		float num3;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1=sc.nextFloat();
		System.out.println("Enter the second number: ");
		num2=sc.nextFloat();
		System.out.println("Enter the third number: ");
		num3=sc.nextFloat();
		avg=(num1+num2+num3)/3;
		System.out.println("The average of three numbers:"+avg);

	}

}
