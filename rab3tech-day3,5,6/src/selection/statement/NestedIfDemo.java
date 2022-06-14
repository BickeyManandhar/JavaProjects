package selection.statement;

public class NestedIfDemo {

	public static void main(String[] args) {
		int age=23;
		String name="Bickey";
		
		if(age>=23) {
			if(name=="Bickey") {
				System.out.println("This is printing because both conditions are true.");
			}
		}

	}

}
