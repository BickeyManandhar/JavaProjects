package questionNumber4;

import java.util.Scanner;

public class SimpleInterest1 {

	public static void main(String[] args) {
		float principal;
		float time;
		float rate;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal: ");
		principal= sc.nextFloat();
		System.out.println("Enter the time: ");
		time= sc.nextFloat();
		System.out.println("Enter the rate: ");
		rate= sc.nextFloat();
		float simpleint= (float)(principal*time*rate)/100;
		System.out.println("The simple interest from the given input is : "+simpleint);
	}

}
