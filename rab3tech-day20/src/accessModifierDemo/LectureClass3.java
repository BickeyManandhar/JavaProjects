package accessModifierDemo;

public class LectureClass3 {
	String name="Zaved Akhtar";
	public void hello() {
		//hello() is public and should be accessible outside of the package but since entry point is default i.e. class Lectureclass
		//we cannot access hello() outside the package hence writing public won't make sense
		System.out.println("Hello..-This is public method coming from default class.");
	}
	
	protected void hi() {
		System.out.println("Hi..This is protected method coming from public class LectureClass3.");
	}
	void goodmorning() {
		System.out.println("Good Morning.");
	}
}
