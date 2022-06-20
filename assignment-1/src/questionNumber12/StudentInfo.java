package questionNumber12;
import java.util.Scanner;
public class StudentInfo {

	public static void main(String[] args) {
		int roll;
	      String name;
	      String nationality;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter your roll number: ");
	      roll=sc.nextInt();
	      System.out.print("Enter your first name: ");
	      name=sc.next();
	      System.out.print("Enter your nationality: ");
	      nationality=sc.next();
	      System.out.println("-------------------------------\n");
	      System.out.println("Username: "+name+"\nRoll number: "+roll+"\nNationality: "+nationality);
	}

}
