package questionNumber8;
import java.util.Scanner;
public class TempConverter {
	public static double fahtocel(double x) {
		double celsius=(x-32)*0.5556;
		return celsius;
	}
	public static double celtofah(double y) {
		double fahrenheit=(y/0.5556)+32;
		return fahrenheit;
	}
	public static void main(String[] args) {
		int input;
		double temp;
		Scanner sc= new Scanner(System.in);
		System.out.print("Press 1 to convert Fahrenheit to Celsius and press 2 to convert Celsius to Fahrenheit: ");
		while(true){
		input=sc.nextInt();
		if(input==1) {
		System.out.print("Enter the temperature in Fahrenheit: ");	
		temp=sc.nextDouble();
		System.out.println(fahtocel(temp));
		System.out.println("---------------------------");
		System.out.print("Press 1 to convert Fahrenheit to Celsius and press 2 to convert Celsius to Fahrenheit: ");
		}
		else if(input==2) {
		System.out.print("Enter the temperature in Celsius: ");	
		temp=sc.nextDouble();
		System.out.println(celtofah(temp));
		System.out.println("---------------------------");
		System.out.print("Press 1 to convert Fahrenheit to Celsius and press 2 to convert Celsius to Fahrenheit: ");
		}
		else {
			System.out.println(" Invalid input.");
			System.out.println("---------------------------");
			System.out.print("Press 1 to convert Fahrenheit to Celsius and press 2 to convert Celsius to Fahrenheit: ");
		}
		}
	}

}
