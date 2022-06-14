
public class MainClass {

	public static void main(String[] args) {
		//creating an object of Dog class
		Dog d=new Dog();
		d.jump();
		d.walk();
		System.out.println("Dog's name is "+d.name);
		System.out.println("Dog has "+d.legs+ " legs.");
		System.out.println("--------------------------");
		System.out.println("--------- Upcasting ---------");
		System.out.println("--------- Super class: Dog ---------");
		System.out.println("--------- Sub class: Bark ---------");
		//reference variable of super class assigned to object of sub class, called upcasting 
		Dog dg=new Bark(); //reference of a super class Dog is pointing to object of a sub class Bark
		dg.jump();
		dg.walk();
		System.out.println("Dog's name is "+dg.name);
		System.out.println("Dog has "+dg.legs+ " legs.");
		System.out.println("--------- Creating object of a subclass ---------");
		Bark b=new Bark();
		b.jump();
		b.walk();
		b.bark();
		System.out.println("Dog's name is "+b.name);
		System.out.println("Dog has "+b.legs+ " legs.");
		System.out.println("Dog has "+b.tail+ " tail.");
		System.out.println("--------------------------");
		System.out.println("--------- Upcasting ---------");
		System.out.println("--------- Super class: Bark ---------");
		System.out.println("--------- Sub class: Sleep ---------");
		Bark bk=new Sleep(); //reference of a super class Bark is pointing to object of a sub class Sleep
		bk.jump();
		bk.walk();
		bk.bark();
		System.out.println("Dog's name is "+bk.name);
		System.out.println("Dog has "+bk.legs+ " legs.");
		System.out.println("Dog has "+bk.tail+ " tail.");
		System.out.println("--------- Creating object of a subclass ---------");
		Sleep s=new Sleep();
		s.sleep();
		System.out.println("Dog's name is "+s.name);
		System.out.println("Dog has "+s.legs+ " legs.");
		System.out.println("Dog has "+s.tail+ " tail.");
		System.out.println("Dog has "+s.color+ " tail.");
		System.out.println("--------------------------");
		System.out.println("--------- Down-casting ---------");
		System.out.println("--------- Super class: Dog ---------");
		System.out.println("--------- Sub class: Bark ---------");
		Dog dd=new Bark(); // first we are upcasting
		Bark bb=(Bark)dd; // here dd is reference of super class that is injecting the attributes and 
						//behavior of super class to sub class which is Bark
		bb.bark(); // Coming from sub class - Bark
		bb.jump(); // Coming from super class - Dog
		bb.walk(); // Coming from super class - Dog
		System.out.println("Dog's name is "+bb.name); // Coming from super class - Dog
		System.out.println("Dog has "+bb.legs+" legs."); // Coming from super class - Dog
		System.out.println("Dog has "+bb.tail+" tail."); // Coming from sub class - Bark
		
	}

}
