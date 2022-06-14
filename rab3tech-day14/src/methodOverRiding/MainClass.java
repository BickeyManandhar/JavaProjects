package methodOverRiding;

public class MainClass {

	public static void main(String[] args) {
		Dog d=new Bark(); //up-casting
						//here we are calling method from left side i.e. Dog class and definition is being called from right side Bark class.
		d.walk();
		
		Dog dg=new Dog();
		dg.walk();

	}

}
