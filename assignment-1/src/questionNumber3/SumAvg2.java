package questionNumber3;

import java.util.Scanner;

public class SumAvg2 {
	public int sum(int a, int b) {
		int c=a+b;
		return c;
	}
	public float avg(int a, int b) {
		float c=(float)(a+b)/2;
		return c;
	}
	public static void main(String[] args) {
		int x;
		int y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		SumAvg2 s=new SumAvg2();
		x=sc.nextInt();
		System.out.println("Enter the second number: ");
		y=sc.nextInt();
		System.out.println("The sum of the numbers: "+ s.sum(x,y));
		System.out.println("The average of the numbers: "+ s.avg(x,y));
	}

}
