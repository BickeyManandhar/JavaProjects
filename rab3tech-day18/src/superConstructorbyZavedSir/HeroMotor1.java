package superConstructorbyZavedSir;

public class HeroMotor1 extends Motor1 { // Sir had extended from Motor
	String color; // this is instance variable or we call it object attribute
	
	public HeroMotor1(String name,String color) {
		super();
		this.name=name; /* instance variable and local variable can have 
						 same name by using "this" keyword - here, this.name holds value from instance variable from Motor1
						 and name hold value from local variable which in case of constructor is in its parameter*/
		this.color=color; /* instance variable and local variable can have 
		 				  same name by using "this" keyword - here, this.color holds value from instance variable 
		 				  and color hold value from local variable which in case of constructor is in its parameter*/
	}
	
	
	public void show() {
		System.out.println("Name from Motor(Super class)="+name);
		System.out.println("color from sub class="+color);
	}
}
