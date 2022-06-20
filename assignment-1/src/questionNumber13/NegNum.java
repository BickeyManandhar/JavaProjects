package questionNumber13;
import java.util.Scanner;
public class NegNum {

	public static void main(String[] args) {
		int num;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number: ");
	      
	      while(true){
	      num=sc.nextInt();  
	      if(num<0){
	          System.out.println("It is negative number = "+num+"\n");
	          System.out.println("---------------------\n");
	          System.out.println("Enter a number: ");
	          
	      }
	      else{
	          System.out.println("Number is non-negative.\n");
	          System.out.println("---------------------\n");
	          System.out.println("Enter a number: ");
	      }

	      }
	}

}
