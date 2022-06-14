
public class LogialOpDemo {

	public static void main(String[] args) {
		// "&&" AND Logical Operator
		
		int x=20, y=3, z= 2;
		
		//In &&, both conditions must be true to result true
		System.out.println("Using && operator to compare the data x:20, y:3 and z:2");
		
		System.out.print("(x<y) && (y<z)= ");
		System.out.println((x<y) && (y<z)); // False && False  --> false
		System.out.print("(x<y) && (y>z)= ");
		System.out.println((x<y) && (y>z)); // False && True --> false
		System.out.print("(x>y) && (y<z)= ");
		System.out.println((x>y) && (y<z)); // True && False --> false
		System.out.print("(x>y) && (y>z)= ");
		System.out.println((x>y) && (y>z)); // True && True --> true
		
		System.out.println("------------------------------------");
		System.out.println("");
		
		// "||" OR Logical Operator
		//In ||, one of the condition must be true to result true
		System.out.println("Using || operator to compare the data x:20, y:3 and z:2");
		
		System.out.print("(x<y) || (y<z)= ");
		System.out.println((x<y) || (y<z)); // False || False  --> false
		System.out.print("(x<y) || (y>z)= ");
		System.out.println((x<y) || (y>z)); // False || True --> true
		System.out.print("(x>y) || (y<z)= ");
		System.out.println((x>y) || (y<z)); // True || False --> true
		System.out.print("(x>y) || (y>z)= ");
		System.out.println((x>y) || (y>z)); // True || True --> true
		
		System.out.println("------------------------------------");
		System.out.println("");
		
		//"!" NOT Logical Operator
		//it returns the reverse result
		System.out.println("Using ! operator to compare the data x:20, y:3");
		
		System.out.print("!(x==y)= ");
		System.out.println(!(x==y));
		System.out.print("!(x>y)= ");
		System.out.println(!(x>y));
		System.out.print("!(x<y)= ");
		System.out.println(!(x<y));
		
		System.out.println("------------------------------------");
		System.out.println("");
		
		
		
		
		
	

	}

}
