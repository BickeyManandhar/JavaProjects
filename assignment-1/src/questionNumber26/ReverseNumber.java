package questionNumber26;
import java.util.Scanner;
public class ReverseNumber {
	/*public static int counter(int x) {
		int count =0;
		while(x!=0) {
			x=x/10;
			count++;
		}
		return count;
	}*/

	public static void main(String[] args) {
		/*int num=123;
		int divider=counter(num);
		for(int i=1;i<=divider;i++) {
			
		}
		int rem1=num%10;//3
		int rem2=num/10;//12
		int rem3=rem2%10;//2
		int rem4=rem2/10;//1
		System.out.println(rem1+""+rem3+""+rem4);*/
		//System.out.println(counter(12345));
		String st;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		st=sc.next();
		System.out.print("The reverse of given number: ");
		for(int i=st.length()-1;i>=0;i--) {
			System.out.print(st.charAt(i));
		}
		
	}

}