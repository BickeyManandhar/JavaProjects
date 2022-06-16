package abstractKeyword;
//abstract class might or might not have abstract method but if a class include an abstract method, the class must be abstract.

abstract public class Parent {
	int age=29;
	String name="John";
	
	abstract public void breathe();
	
	abstract public void see();
	
	public void walk() { //abstract class can have non-abstract method
		System.out.println("He can walk");
	}
	
}
