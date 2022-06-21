package questionNumber19;
import java.util.Scanner;
public class TriangleType {

	public static void main(String[] args) {
		float a;
	    float b;
	    float c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three sides of triangle: ");
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
	      if (a==b && b==c){
	          System.out.println("It is equilateral triangle.");
	      }
	      else if(a*a==(b*b+c*c) || b*b==(a*a+c*c) || c*c==(a*a+b*b) ){
	          System.out.println("It is a right angled triangle.");
	      }
	      else if(a==b || b==c || c==a) {
	          System.out.println("It is an isoceles triangle.");
	      }
	      else if(a!=b && b!=c){
	          System.out.println("It is a scalene triangle.");
	      }

	}

}
