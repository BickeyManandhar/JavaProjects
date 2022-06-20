package questionNumber15;
import java.util.Scanner;
public class AsciiChar {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number between 0-128 to know its ASCII character: ");
		num=sc.nextInt();
		System.out.print("The ASCII character of given number: "+(char)num);
	}

}
