package classObject;

import constructor.demo.Dog1;

public class DogMain {

	public static void main(String[] args) {
		//All different objects having same data.
		//Limitations
		Dog d=new Dog();
		System.out.println("------------ First Object ------------");
		System.out.println("Name of dog: "+d.name);
		System.out.println("Number of eyes: "+d.eyes);
		System.out.println("Number of tail: "+d.tail);
		System.out.println("Color of dog: "+d.color);
		d.run();
		
		Dog dg=new Dog();
		System.out.println("------------ Second Object ------------");
		System.out.println("Name of dog: "+dg.name);
		System.out.println("Number of eyes: "+dg.eyes);
		System.out.println("Number of tail: "+dg.tail);
		System.out.println("Color of dog: "+dg.color);
		d.bark();
		
		Dog dog=new Dog();
		System.out.println("------------ Third Object ------------");
		System.out.println("Name of dog: "+dog.name);
		System.out.println("Number of eyes: "+dog.eyes);
		System.out.println("Number of tail: "+dog.tail);
		System.out.println("Color of dog: "+dog.color);
		d.bark();

	}

}
