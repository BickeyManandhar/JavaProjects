package superConstructor;

public class Nose extends SenseOrgan{
	String func="Smell";
	
	public Nose() {
		super();//created by compiler
	}
	
	public void disp() {
		System.out.println("Name=="+name);
		System.out.println("func=="+func);
	}
}
