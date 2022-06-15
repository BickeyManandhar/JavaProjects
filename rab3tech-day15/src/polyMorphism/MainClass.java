package polyMorphism;

public class MainClass {

	public static void main(String[] args) {
		//creating object of class Dog
		Dog d;
			d= new Dog();
			System.out.println("Name of dog is "+d.name);
			System.out.println("Number of eyes dog has: " +d.eyes);
			d.walk();
			d.bark();
			System.out.println("---------------");
			//1st-check if we can access the particular method in left side then,2nd- check the method on right side for definition.
			//up-casting
			d=new BrownDog();
			d.walk();
			d.bark();
			System.out.println("---------------");
			//up-casting
			d=new SleepDog();
			d.walk();
			d.bark();
			System.out.println("---------------");
			//up-casting
			d=new RedDog();
			d.walk();
			d.bark();
			System.out.println("--------End of Program-------");

	}

}
