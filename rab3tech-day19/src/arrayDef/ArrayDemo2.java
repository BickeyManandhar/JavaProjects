package arrayDef;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int arrsize;
		 String value;
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the size of array you want to create: ");
		 arrsize=sc.nextInt();
		 String[] num= new String[arrsize];
		 
		 for(int i=0;i<arrsize;i++) {
			 System.out.println("Enter string value you want to store in your "+(i+1)+" array: ");
			 value=sc.next();
			 num[i]=value;
		 }
		 System.out.println("-------------------------------------------------\n");
		 for(int i=0;i<arrsize;i++) {
			 System.out.println("This is the value inside our "+(i+1)+ " first element of array: "+num[i]);
		 }

	}

}
