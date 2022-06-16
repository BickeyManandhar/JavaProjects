package abstractKeyword;

public class MainClass {

	public static void main(String[] args) {
	//	Parent b=new Parent(); //we cannot create instance of Parent class sine it is abstract class 
	//	Parent p; //but we can create reference of it
		Child c=new Child(); //this creates object of Parent as well
		System.out.println("Attributes and behavior from Super Class - Parent");
		System.out.println("Name: "+c.name);//coming from super class - Parent
		System.out.println("Age: "+c.age);//coming from super class - Parent
		c.walk();//coming from super class - Parent
		System.out.println("-----------------------------");
		System.out.println("Attributes and behavior from Sub Class - Child");
		System.out.println("D.O.B. of child: "+c.year);//coming from sub class - Child
		c.breathe();//coming from sub class - Child
		c.see();//coming from sub class - Child
	}

}
