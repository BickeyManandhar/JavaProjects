package staticMethod;

public class Fruit {
	int price=100;
	static void banana() {
		System.out.println("Sweet Banana.");
	}
	public static void main(String[] args) {
		//since the method is static, to call it we do not need to create object but creating an object still works fine
		//internally the code below will do same as Fruit.banana();
		/*Fruit fr= new Fruit();
		fr.banana();*/ 
		
		Fruit.banana();
		
		

	}

}
