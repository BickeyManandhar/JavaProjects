package questionNumber5;
import java.util.Scanner;

public class AreaOfShape {
	public double areaofcircle(double r) {
		double PI= 3.14285714;
		double ac=PI*r*r;
		return ac;
	}
	public double areaofrectangle(double l, double b) {
		double ar=l*b;
		return ar;
	}
	public double areaoftriangle(double b, double h) {
		double at= (double)(b*h)/2;
		return at;
	}
	public static void main(String[] args) {
		double radius;
		double length;
		double breadth;
		double base;
		double height;
		int input;
		Scanner sc= new Scanner(System.in);
		AreaOfShape a=new AreaOfShape();
		System.out.print("Press (1) to find Area of Circle, (2) to find area of rectangle and (3) to find area of triangle:  ");
		while(true) {
		input=sc.nextInt();
		if(input==1) {
		System.out.println("Enter radius of a circle: ");
		radius=sc.nextDouble();
		System.out.println("Area of circle is " +a.areaofcircle(radius)+" square units.");
		System.out.println("----------------------------------");
		System.out.print("Press (1) to find Area of Circle, (2) to find area of rectangle and (3) to find area of triangle:  ");
		}
		else if(input==2) {
		System.out.println("Enter length of a rectangle: ");
		length=sc.nextDouble();
		System.out.println("Enter breadth of a rectangle: ");
		breadth=sc.nextDouble();
		System.out.println("Area of rectangle is " +a.areaofrectangle(length, breadth)+" square units.");
		System.out.println("----------------------------------");
		System.out.print("Press (1) to find Area of Circle, (2) to find area of rectangle and (3) to find area of triangle:  ");
		}
		else if( input==3) {
		System.out.println("Enter base of a triangle: ");
		base=sc.nextDouble();
		System.out.println("Enter height of a triangle: ");
		height=sc.nextDouble();
		System.out.println("Area of triangle is " +a.areaoftriangle(base,height)+" square units.");
		System.out.println("----------------------------------");
		System.out.print("Press (1) to find Area of Circle, (2) to find area of rectangle and (3) to find area of triangle:  ");
		}
		else {
			System.out.println("Invalid input.");
			System.out.println("----------------------------------");
			System.out.print("Press (1) to find Area of Circle, (2) to find area of rectangle and (3) to find area of triangle:  ");
		}
		}

	}

}
