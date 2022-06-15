package polyMorphism;

public class RedDog extends Dog{
	public void red() {
		System.out.println("Dog is red in color.");
}
//method overriding
	public void walk() {
		System.out.println("Dog can walk the fastest.");
}
	public void bark() {
		System.out.println("Dog can Bark the loudest.");
}
}
