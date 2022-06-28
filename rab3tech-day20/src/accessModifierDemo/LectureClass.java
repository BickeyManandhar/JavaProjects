package accessModifierDemo;

class LectureClass { // class is default type so its attributes and behavior is only accessible within inside the package
	
	private String name="Zaved Akhtar";
	public void hello() {
		//hello() is public and should be accessible outside of the package but since entry point is default i.e. class Lectureclass
		//we cannot access hello() outside the package hence writing public won't make sense
		System.out.println("Hello..-This is public method coming from default class.");
	}
	
	void hi() {
		System.out.println("Hi..This is default method coming from default class.");
	}

}
