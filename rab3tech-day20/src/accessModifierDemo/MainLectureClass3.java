package accessModifierDemo;

public class MainLectureClass3 {

	public static void main(String[] args) {
		LectureClass3 lc=new LectureClass3();
		lc.hello(); 
		lc.hi();// it is protected method hence accessible here outside the class.  
		System.out.println(lc.name); //since name is default it is accessible outside its class but within the package only
	}

}
