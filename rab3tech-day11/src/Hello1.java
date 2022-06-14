
public class Hello1 {
	/*How the code gets executed when instance of a class is created ? : 
	 * Loading the class defination inside a memory
	 * Memory for static thing will happen - If there are two or more static things it will execute based on their order
	 * Non-static/instance variables will be initialized
	 * Non-static/instance block will take place
	 * Constructor is called
	 */
	int x=786;
	public Hello1() {
		System.out.println("I am default constructor"); //this gets executed sixth
		
}
	//define static block
		static {
			System.out.println("I am from first static block"); //this gets executed first because it is the first static block in order
		}
	//define instance block
	{
		System.out.println("I am from first instance block"); //this gets executed fourth
		x++;
	}
	
	//define static block
	static {
		System.out.println("I am from second static block"); //this gets executed second because it is the first static block in order
	}
	
	public void wow() {
		System.out.println("Value of x= " +x); //this gets executed only if it is being called inside main method
	}
	
	//define instance block
		{
			System.out.println("I am from second instance block"); //this gets executed fifth
			x++;
		}
	//define static block
	static {
		System.out.println("I am from third static block"); //this gets executed third because it is the third static block in order
	}
}
