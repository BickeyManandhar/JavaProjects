import java.util.Scanner;

public class AreaOfRectangle {
static int aor(int l, int b) {
	return l*b;
}
	public static void main(String[] args) {
		int  input1;
		int input2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		input1=sc.nextInt();
		System.out.println("Enter breadth of rectangle: ");
		input2=sc.nextInt();
		System.out.println("The are of rectangle of length"+input1+" and breadth "+input2+" is "+aor(input1,input2));

	}

}
