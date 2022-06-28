package arrayDef;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int arrsize;
		 int value;
		 int sum=0;
		 int update;
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the size of array you want to create: ");
		 arrsize=sc.nextInt();
		 int num[]= new int[arrsize];
		 
		 for(int i=0;i<arrsize;i++) {
			 System.out.println("Enter integer value you want to store in your "+(i+1)+" array: ");
			 value=sc.nextInt();
			 num[i]=value;
		 }
		 System.out.println("-------------------------------------------------\n");
		 for(int i=0;i<arrsize;i++) {
			 sum=sum+num[i];
			 System.out.println("This is the value inside our "+(i+1)+ " first element of array: "+num[i]+"\n");
			 System.out.println("The sum upto this element is "+sum);
			 System.out.println("----------------------------------------------------------------------------");
		 }
		 System.out.print("Do you want to update value of element in your array? Press '0' to end the program and press any key to update the value in the array: ");
		 update=sc.nextInt();
		 if(update==0) {
		 System.out.println("-------------- End of Program. -------------- ");
		 }
		 else {
			 for(int i=0;i<arrsize;i++) {
				 System.out.println("Enter integer value you want to update in your "+(i+1)+" array: ");
				 value=sc.nextInt();
				 num[i]=value;
			 }
			 System.out.println("-------------------------------------------------\n");
			 for(int i=0;i<arrsize;i++) {
				 System.out.println("Updated value: \n");
				 System.out.println("This is the updated value inside our "+(i+1)+ " first element of array: "+num[i]+"\n");
				 System.out.println("----------------------------------------------------------------------------");
			 }
		 }

	}

}
