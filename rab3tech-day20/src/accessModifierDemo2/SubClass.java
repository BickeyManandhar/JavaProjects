package accessModifierDemo2;
import accessModifierDemo.LectureClass3;

public class SubClass extends LectureClass3{
	public static void main(String[] args) {
	SubClass sc=new SubClass();
	sc.hi();//This is an example of protected type of access modifier. It is accessible outside the package in subclass. 
			//It is accessing hi() method which has protected access modifier. 
	sc.hello();//this is an example of public type of access modifier which is accessible out side the package.
	//sc.goodmorning();//this is an example of default access modifier which is only accessible inside same package
}

}
