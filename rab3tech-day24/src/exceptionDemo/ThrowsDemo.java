package exceptionDemo;

import java.util.Scanner;

public class ThrowsDemo {
//caller must handle the exception using try and catch block inside main method
	static private String takeInput() throws Exception {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name: ");
		name = sc.nextLine();

		if (name.equals("")) { //blank / no input
			Exception ex = new Exception("ExceptionBlankName");
			throw ex; // throw is used to throw an exception
		}
		return name;
	}

	public static void main(String[] args) { 
			String name=null;
			try{
			name=takeInput();
			}
			catch(Exception e){
				e.printStackTrace();
				//System.out.println(e.getMessage());
				return;
			}
			//out of try catch block
			System.out.println("Hello "+name);
			}

}
