package arrayDef;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// in simple variable we can store only one value at a moment
		//int x=1; String name="Bickey"; Char c='A';   -->we can later do x=2; but we cannot call its old value
		//Array helps us to store multiple value at a moment.
		//An array is a collection of similar data type.
		
		//Syntax of an array
		// data_type name_of_array[]= new data_type[length_of_array];
		// OR
		//data_type[] name_of_array= new data_type[length_of_array];
		 int arrsize;
		 int value;
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the size of array you want to create: ");
		 arrsize=sc.nextInt();
		 int num[]= new int[arrsize];
		 //entering value inside the array
		 for(int i=0;i<arrsize;i++) {
			 System.out.println("Enter integer value you want to store in your "+(i+1)+" array: ");
			 value=sc.nextInt();
			 num[i]=value;
		 }
		 System.out.println("-------------------------------------------------\n");
		 //printing value from array
		 for(int i=0;i<arrsize;i++) {
			 System.out.println("This is the value inside our "+(i+1)+ " first element of array: "+num[i]);
		 }

	}

}
