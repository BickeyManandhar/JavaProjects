import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number a: ");
		a=sc.nextInt();
		System.out.println("Enter the second number b: ");
		b=sc.nextInt();
		System.out.println("The numbers before swap is a: "+a+" and b: " +b);
		c=a;
		a=b;
		b=c;
		System.out.println("The numbers after swap is a: "+a+" and b: " +b);
	}

}
