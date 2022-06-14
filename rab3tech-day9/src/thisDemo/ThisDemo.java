package thisDemo;

public class ThisDemo {
	//these are called object attributes that are defined outside constructor// instance variables
	int num1;
	int num2;
	String str;
	
	public ThisDemo() {
		
	}
	
	public ThisDemo(int num1,int num2, String str) {
		this.num1=num1;
		this.num2=num2;
		this.str=str;
	}
	
	public ThisDemo(int num1) {
		this.num1=num1;
	}
	
	public ThisDemo(String str) {
		this.str=str;
	}
	
	public ThisDemo(int num1,String str) {
		this.num1=num1;
		this.str=str;
	}
	
	public ThisDemo(String str, int num2) {
		this.str=str;
		this.num2=num2;
	}
}
