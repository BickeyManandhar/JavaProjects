package questionNumber7;
import java.util.Scanner;
public class VolOfCylinder {

	public static void main(String[] args) {
		double PI=3.14285714;
		double radius;
		double length;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius of cylinder: ");
		radius=sc.nextDouble();
		System.out.print("Enter length of cylinder: ");
		length=sc.nextDouble();
		double volume=PI*radius*radius*length;
		System.out.println("The volume of cylinder is "+volume+" cubic units.");

	}

}
