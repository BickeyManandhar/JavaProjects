package superConstructor;

public class Nose1 extends SenseOrgan1{
	String func;
	
	public Nose1(String name, String func) {
		super();//created by compiler
		this.name=name;
		this.func=func;
	}
	
	public void disp() {
		System.out.println("Name=="+name);
		System.out.println("func=="+func);
	}
}
