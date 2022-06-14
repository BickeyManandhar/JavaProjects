package selection.statement;

public class IfStetementDemo {

	public static void main(String[] args) {
		int num1= 5;
		int num2=10;
		System.out.print("Value of num1:5 and num2:10. Here num1<num2=");
		System.out.println(num1<num2); // using relational operator we learned on day 2
		
		if(num1<num2) {
			// This will print out if the above condition is true.
			System.out.print("This will get printed if ");
			System.out.println("num1 is less than num2."); 
		}
		

	}

}
