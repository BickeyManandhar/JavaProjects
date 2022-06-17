package interfacedemo;
//multiple inheritance in java where sub-class implements multiple interfaces
// one class implementing multiple interface

public class Child implements Mother, Father{
	public void tallheight() {
		//we have to implement/override all the methods from super interface and can leave it blank if we do not need to use
		//this is coming from mother interface
	}
	public void shortheight() {
		System.out.println("shortheight method-This is coming from Father.");
	}
	public void dryskin() {
		System.out.println("dryskin method-This is coming from Mother.");
	}
	public void oilyskin() {
		System.out.println("oilyskin method-This is coming from Father.");
	}
	public void mediumheight() {//unique behavior of child
		System.out.println("Child is of medium height.");
	}
}
