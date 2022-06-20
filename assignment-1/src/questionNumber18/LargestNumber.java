package questionNumber18;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		  int num1;
	      int num2;
	      int num3;
	      Scanner sc=new Scanner(System.in);
	      System.out.print("Enter num1: ");
	      num1=sc.nextInt();
	      System.out.print("Enter num2: ");
	      num2=sc.nextInt();
	      System.out.print("Enter num3: ");
	      num3=sc.nextInt();
	      if (num1>num2 && num1>num3){
	    	  System.out.println("----------------------------");
	          System.out.println("The largest number is "+num1);
	      }
	      else if(num2>num1 && num2>num3){
	    	  System.out.println("----------------------------");
	          System.out.println("The largest number is "+num2);
	      }
	      else {
	          System.out.println("The largest number is "+num3);
	      }

	}

}
