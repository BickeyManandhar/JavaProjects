package inheritanceDemo;
//This is super class/parent class
public class Dog {
	String name="Tommy";
	int tail=1;
	int leg=4;
	//run()+walk()+bark()
	public void run() {
		System.out.println("Dog can run. ");
	}
	
	public void walk() {
		System.out.println("Dog can walk. ");
	}
	
	public void bark() {
		System.out.println("Dog can bark. ");
	}
}
