package constructor.demo;
//In this program I have created number of constructor with different parameters known as constructor overloading
public class Dog1 {
	String name="Tommy";
	int eyes=2;
	int tail=1;
	String color="brown";
	
	public Dog1() {
		//default constructor or no argument constructor
		//It is called when an object of a class is created
		//need to define default constructor before parameterized constructor.
	}
	public Dog1(String n) {
		//Overcome the limitations 
		//parameterized constructor 
		name=n;
	
	}
	public Dog1(int e) {
		//Overcome the limitations 
		//parameterized constructor
		eyes=e;
	}
	
	public Dog1(String n, int e) {
		//Overcome the limitations 
		//parameterized constructor 
		name=n;
		eyes=e;

	}
	
	public Dog1(int t, String c) {
		//Overcome the limitations 
		//parameterized constructor 
		tail=t;
		color=c;
	}
	public Dog1(String n, String c) {
		//Overcome the limitations 
		//parameterized constructor 
		name=n;
		color=c;
	}
	public Dog1(String n, int e, int t) {
		//Overcome the limitations 
		//parameterized constructor 
		name=n;
		eyes=e;
		tail=t;
	}

	public Dog1(int e, int t, String c) {
		//Overcome the limitations 
		//parameterized constructor 
		eyes=e;
		tail=t;
		color=c;
	}
	public Dog1(String n,int t, String c) {
		//Overcome the limitations 
		//parameterized constructor 
		name=n;
		tail=t;
		color=c;
	}
	public Dog1( int e,String n, int t, String c) {
		//Overcome the limitations 
		//parameterized constructor 
		name=n;
		eyes=e;
		tail=t;
		color=c;
	}
	public Dog1(String n, int t, String c, int e) {
		//Overcome the limitations 
		//parameterized constructor 
		name=n;
		eyes=e;
		tail=t;
		color=c;
	}
	public Dog1(String n, int t, int e, String c) {
		//Overcome the limitations 
		//parameterized constructor 
		name=n;
		eyes=e;
		tail=t;
		color=c;
	}
	public Dog1( int e,int t,String n, String c) {
		//Overcome the limitations 
		//parameterized constructor 
		name=n;
		eyes=e;
		tail=t;
		color=c;
	}
	public Dog1(String n, String c, int e,int t) {
		//Overcome the limitations 
		//parameterized constructor 
		name=n;
		eyes=e;
		tail=t;
		color=c;
	}
	
	static void bark() {
		System.out.println("Dog can bark");
	}
	static void run() {
		System.out.println("Dog can run");
	}
	
}
