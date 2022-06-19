package questionNumber6;

import java.util.Scanner;

import questionNumber5.AreaOfShape;

public class PerimeterOfShape {
	public double perimeterofcircle(double r) {
		double PI= 3.14285714;
		double pc=2*PI*r;
		return pc;
	}
	public double perimeterofrectangle(double l, double b) {
		double pr=2*l*b;
		return pr;
	}
	public double perimeteroftriangle(double a, double b, double c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		double radius;
		double length;
		double breadth;
		double a;
		double b;
		double c;
		int input;
		Scanner sc= new Scanner(System.in);
		PerimeterOfShape p=new PerimeterOfShape();
		System.out.print("Press (1) to find Perimeter of Circle, (2) to find Perimeter of rectangle and (3) to find Perimeter of triangle:  ");
		while(true) {
		input=sc.nextInt();
		if(input==1) {
		System.out.println("Enter radius of a circle: ");
		radius=sc.nextDouble();
		System.out.println("Perimeter of circle is " +p.perimeterofcircle(radius)+" units.");
		System.out.println("----------------------------------");
		System.out.print("Press (1) to find Perimeter of Circle, (2) to find Perimeter of rectangle and (3) to find Perimeter of triangle:  ");
		}
		else if(input==2) {
		System.out.println("Enter length of a rectangle: ");
		length=sc.nextDouble();
		System.out.println("Enter breadth of a rectangle: ");
		breadth=sc.nextDouble();
		System.out.println("Perimeter of rectangle is " +p.perimeterofrectangle(length, breadth)+" units.");
		System.out.println("----------------------------------");
		System.out.print("Press (1) to find Perimeter of Circle, (2) to find Perimeter of rectangle and (3) to find Perimeter of triangle:  ");
		}
		else if( input==3) {
		System.out.println("Enter one side of a triangle: ");
		a=sc.nextDouble();
		System.out.println("Enter another side of a triangle: ");
		b=sc.nextDouble();
		System.out.println("Enter third side of a triangle: ");
		c=sc.nextDouble();
		System.out.println("Perimeter of triangle is " +p.perimeteroftriangle(a,b,c)+" units.");
		System.out.println("----------------------------------");
		System.out.print("Press (1) to find Perimeter of Circle, (2) to find Perimeter of rectangle and (3) to find Perimeter of triangle:  ");
		}
		else {
			System.out.println("Invalid input.");
			System.out.println("----------------------------------");
			System.out.print("Press (1) to find Perimeter of Circle, (2) to find Perimeter of rectangle and (3) to find Perimeter of triangle:  ");
		}

		}

}
}
