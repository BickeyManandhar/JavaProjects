package polyMorphism;

public class BrownDog extends Dog{
	public void brown() {
		System.out.println("Dog is brown in color.");
	}
	//method overriding
	public void walk() {
		System.out.println("Dog can walk faster.");
	}
	public void bark() {
		System.out.println("Dog can Bark louder.");
	}
}
