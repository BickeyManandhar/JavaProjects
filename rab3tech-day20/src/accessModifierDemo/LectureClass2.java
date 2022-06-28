package accessModifierDemo;

class LectureClass2 {
	String name="Zaved Akhtar";
	public void hello() {
		//hello() is public and should be accessible outside of the package but since entry point is default i.e. class Lectureclass
		//we cannot access hello() outside the package hence writing public won't make sense
		System.out.println("Hello..-This is public method coming from default class.");
	}
	
	private void hi() {
		System.out.println("Hi..This is private method coming from default class.");
	}
}
