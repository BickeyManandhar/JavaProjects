package supriseTest;

public class MainClass {

	public static void main(String[] args) {
		Student st= new Student();
		Teacher tc=new Teacher();
		System.out.println("Student's name: "+st.name);
		st.studentmajor();
		st.studentskills();
		System.out.println("----------------------------------");
		System.out.println("Teacher's name: "+tc.name);
		tc.teacherqualification();
		tc.teacherexperience();

	}

}
