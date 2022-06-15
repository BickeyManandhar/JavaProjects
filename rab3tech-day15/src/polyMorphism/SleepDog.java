package polyMorphism;

public class SleepDog extends Dog{
	public void Sleep() {
		System.out.println("Dog can sleep.");
	}
	//method overriding
	public void walk() {
		System.out.println("Dog can walk slower.");
	}
}
