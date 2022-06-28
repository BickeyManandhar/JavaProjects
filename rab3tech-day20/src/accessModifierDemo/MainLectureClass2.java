package accessModifierDemo;

public class MainLectureClass2 {

	public static void main(String[] args) {
		LectureClass2 lc=new LectureClass2();
		lc.hello(); 
		//lc.hi();// it is private method hence not accessible here.  It gives compile time error
		System.out.println(lc.name); //since name is default it is accessible outside its class but within the package only
	}

}
