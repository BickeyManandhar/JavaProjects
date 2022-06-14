package selection.statement;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		int week;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1 to 7 to get the corresponding day of the week: ");
		week=sc.nextInt();;
		switch(week) {
		case 1:
			System.out.println("It is Sunday.");
		break;
	
		case 2:
			System.out.println("It is Monday.");
		break;
		
		case 3:
			System.out.println("It is Tuesday.");
		break;
		
		case 4:
			System.out.println("It is Wednesday.");
		break;
		case 5:
			System.out.println("It is Thursday.");
		break;
		case 6:
			System.out.println("It is Friday.");
		break;
		case 7:
			System.out.println("It is Saturday");
		break;
		default: System.out.println("Invalid input.");
		}
		
		int month;
		System.out.println("Enter number 1 to 12 to get the corresponding month: ");
		month=sc.nextInt();;
		switch(month) {
		case 1:
			System.out.println("It is January.");
		break;
	
		case 2:
			System.out.println("It is Feburary.");
		break;
		
		case 3:
			System.out.println("It is March.");
		break;
		
		case 4:
			System.out.println("It is April.");
		break;
		case 5:
			System.out.println("It is May.");
		break;
		case 6:
			System.out.println("It is June.");
		break;
		case 7:
			System.out.println("It is July.");
		break;
		case 8:
			System.out.println("It is August.");
		break;
		case 9:
			System.out.println("It is September.");
		break;
		case 10:
			System.out.println("It is October.");
		break;
		case 11:
			System.out.println("It is November.");
		break;
		case 12:
			System.out.println("It is December.");
		break;
		default: System.out.println("Invalid input.");
		}

	}

}
