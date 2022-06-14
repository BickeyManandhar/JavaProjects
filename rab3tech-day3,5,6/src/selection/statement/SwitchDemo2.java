package selection.statement;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		char grade;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your letter grade: ");
		grade=sc.next().charAt(0);
		switch(grade) {
		case 'A':
			System.out.println("Your grade range is 90-100");
		break;
	
		case 'B':
			System.out.println("Your grade range is 80-90");
		break;
		
		case 'C':
			System.out.println("Your grade range is 70-80");
		break;
		
		case 'D':
			System.out.println("Your grade range is 60-70");
		break;
		default: System.out.println("Either you failed or the letter grade you input is incorrect.");
		}

	}

}
