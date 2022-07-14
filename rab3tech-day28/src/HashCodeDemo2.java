
public class HashCodeDemo2 {
//hashCode and memory location are different thing
	public static void main(String[] args) {
		String st1 = "Bickey";
		System.out.println(st1.hashCode());

		Character b='b';
		System.out.println(b.hashCode());
		
		Character A='A';
		System.out.println(A.hashCode());

		Character B='B';
		System.out.println(B.hashCode());
		
		System.out.println("--------------------");
		
		Integer num1= 1234567890;
		System.out.println(num1.hashCode());
		System.out.println("--------------------");//1234567890
		
		Integer num2 = 01;
		System.out.println(num2.hashCode());//1
		
		
	}

}
