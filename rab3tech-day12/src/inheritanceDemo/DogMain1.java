 package inheritanceDemo;

public class DogMain1 {

	public static void main(String[] args) {
		//upcasting- Super class reference can hold reference of subclass object
		Dog dm=new DogNew();
		dm.run(); //method coming from *LHS- super class i.e. Dog class* and definition from *RHS- sub class i.e. DogNew*
		dm.walk(); //method coming from *LHS- super class i.e. Dog class* and definition from *RHS- sub class i.e. DogNew*
		dm.bark(); //method coming from *LHS- super class i.e. Dog class* and definition from *RHS- sub class i.e. DogNew*
		//dm.sleep(); //this will not execute since method cannot be called because we do not have sleep() method in LHS- super class i.e. Dog class.
	}

}
