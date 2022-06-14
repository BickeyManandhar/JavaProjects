
public class Hello {
	/*How the code gets executed when instance of a class is created ? : 
	 * Loading the class defination inside a memory
	 * Memory for static thing will happen
	 * Non-static/instance variables will be initialized
	 * Non-static/instance block will take place
	 * Constructor is called
	 */
	int x=786;
	public Hello() {
		System.out.println("I am default constructor"); //this gets executed third
		
}
	
	//define instance block
	{
		System.out.println("I am from instance block"); //this gets executed second
		x++;
	}
	
	//define static block
	static {
		System.out.println("I am from static block"); //this gets executed first
	}
	
	public void wow() {
		System.out.println("Value of x= " +x); //this gets executed only if it is being called inside main method
	}
}
