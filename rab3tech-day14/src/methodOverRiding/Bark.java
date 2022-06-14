package methodOverRiding;

public class Bark extends Dog{
	int tail=1;
	public void bark(){
		System.out.println("Dog can bark.");
	}
	
	//override the method
	//declaring a method in a child class which already exist in parent class
	//that is known as method overriding
	
	public void walk() { //take fully classified name
		System.out.println("Dog can walk faster.");
	}
	
}
