import java.util.Scanner;

public class Square {
static int square(int a) {
	return a*a;
}
	public static void main(String[] args) {
		int  input1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		input1=sc.nextInt();
		System.out.println("The square of "+input1+" is "+square(input1));

	}

}
