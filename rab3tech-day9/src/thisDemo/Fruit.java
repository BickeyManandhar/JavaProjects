package thisDemo;

public class Fruit {
 int num=1;//This is object attribute that is defined outside the constructor which we call instance variable
 
 public void print() {
	 int num=2;// this is local variable of the constructor
	 System.out.println("This is the local vairable defined inside the constructor = " +num);// this will give local variable num i.e. 2
	 System.out.println("This is the address of the calling object = " +this);// this will hold the address of the caLLING OBJECT
	 System.out.println("This is the value of instance variable defined outside the constructor = " +this.num);//this keyword hold the address of the calling object 
	 																											//so this.num give us num=1
 }
}
