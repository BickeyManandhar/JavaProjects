package questionNumber25;
//not right, so skipped
import java.util.Scanner;
public class StudentInfo {

	public static void main(String[] args) {
		int studentnum;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		studentnum=sc.nextInt();
		String student[];
		student=new String[studentnum];
		float score[]=new float[studentnum];
		for(int i=0;i<studentnum-1;i++) {
			System.out.print("Enter the name of number "+ (i+1) + " student: ");
			student[i]=sc.next();
			System.out.print("Enter student's score: ");
			score[i]=sc.nextFloat();
			
		}
		for(int i=0;i<studentnum-1;i++) {
			System.out.println("Student's name is : "+student[i]+ " and student's score is "+score[i]);

		}
		
		
		

	}

}
