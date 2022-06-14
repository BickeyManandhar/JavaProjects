package iteration.statement;

public class DoWhileLoopSum {

	public static void main(String[] args) {
		int i=1,sum=0;
		do {
			sum=sum+i;
			System.out.println("The sum of first five natural numbers: "+sum);
			i++;
		}while(i<=5);
		
	}

}
