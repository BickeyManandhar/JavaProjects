package staticVariable;

public class MobileVar {
	String name; //object attribute/instance variable
	static String color; // class variable- when a variable is declared as static type, then a single copy of variable is created and shared among all the objects at class level.
	
	public MobileVar() {
		
	}
	public MobileVar(String name, String color) {
		this.name=name;
		this.color=color;
	}
	public void info() {
		System.out.println("Name="+name);
		System.out.println("this.name="+this.name);
		System.out.println("Color="+color);
		System.out.println("this.color="+this.color);
	}
}
