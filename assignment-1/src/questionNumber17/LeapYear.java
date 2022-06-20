package questionNumber17;
/*To be a leap year, the year number must be divisible by four – except for
end-of-century years, which must be divisible by 400. This means that the year 2000
was a leap year, although 1900 was not.*/
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a year to check if it is leap year or not: ");
		year=sc.nextInt();
	      if(year%100==0){
	          if(year%400==0){
	             System.out.println("It is a leap year"); 
	          }
	          else {
	          System.out.println("It is not a leap year");
	      }
	      }
	      else if(year%4==0){
	      System.out.println("It is a leap year");
	      }
	      else {
	          System.out.println("It is not a leap year");
	      }

	}

}
