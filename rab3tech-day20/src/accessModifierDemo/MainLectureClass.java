package accessModifierDemo;

public class MainLectureClass {

	public static void main(String[] args) {
		LectureClass lc=new LectureClass();
		/* hello() and hi() methods regardless what access modifier they have, it will be accessible inside the package only because 
		their entry point i.e. the LectureClass is default.*/
		lc.hello(); 
		lc.hi();
		//System.out.println(lc.name); //since name is private it is not accessible outside its class
	}

}
