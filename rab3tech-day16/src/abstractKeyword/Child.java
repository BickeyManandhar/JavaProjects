package abstractKeyword;

public class Child extends Parent{
	int year=2022;

	@Override
	public void breathe() {
		// body of the abstract method breathe() is provided here
		System.out.println("He can breathe. ");
		
	}

	@Override
	public void see() {
		// body of the abstract method see() is provided here
		System.out.println("He can see. ");
	}
	
}
