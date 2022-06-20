package questionNumber14;
import java.util.Scanner;
public class IntRelation {

	public static void main(String[] args) {
		int num1;
        int num2;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two numbers number: ");
        
      while(true){
      num1=sc.nextInt();
      num2=sc.nextInt(); 
      if(num1==num2){
          System.out.println("They are equal.");
          System.out.println("---------------------------------------------\n");
          System.out.println("Enter a number: ");
      }
      else if(num1<num2){
          System.out.println("The first number '"+num1+"' is less than the second number '"+num2+"' .\n");
          System.out.println("---------------------------------------------\n");
          System.out.println("Enter a number: ");
      }
      else if(num1>num2){
          System.out.println("The first number '"+num1+"' is greater than the second number '"+num2+"' .\n");
          System.out.println("---------------------------------------------\n");
          System.out.println("Enter a number: ");

	}
      
      }
	}
}
