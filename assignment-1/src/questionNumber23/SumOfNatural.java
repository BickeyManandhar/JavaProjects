package questionNumber23;

import java.util.Scanner;

public class SumOfNatural {
	public static int natural(int x){
        int counter=0;
        for(int i=1;i<=x;i++){
           counter=i+counter;
        }
        return counter;
    }

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number upto which you want to find the sum: ");
		n=sc.nextInt();
		System.out.println(natural(n));

	}

}
