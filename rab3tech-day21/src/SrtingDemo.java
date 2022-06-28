
public class SrtingDemo {

	public static void main(String[] args) {
		// using String literal (inside InternPool)
		String firstname = "Bickey";
		String lastname = "Manandhar";
		// using new operator(inside Java heap)
		String name1 = new String("Bikki");
		// integers before string will be considered as integer and will be summed up
		System.out.println(1 + 2 + firstname); // 3Bickey
		// integers after string will be considered as string and will be concatenated
		System.out.println(firstname + 1 + 2);// Bickey12
		System.out.println(1 + 2 + firstname + 3 + 4);// 3Bickey34
		System.out.println(1 + 2 + firstname + 3 + 4 + lastname);// 3Bickey34Manandhar
		System.out.println((1 + 2 + firstname) + (3 + 4 + lastname));// 3Bickey4Manandhar
		System.out.println(firstname + lastname);// BickeyManandhar
		System.out.println("--------------------------------------");
		// Upper case conversion method
		System.out.println("firstname converted to uppercase: " + firstname.toUpperCase());
		System.out.println("lastname converted to uppercase: " + lastname.toUpperCase());
		System.out.println("--------------------------------------");
		// Length method
		System.out.println("Length of firstname: " + firstname.length());
		System.out.println("Length of lastname: " + lastname.length());
		System.out.println("--------------------------------------");
		// charAt method
		char ch = firstname.charAt(1);
		System.out.println("using charAt method on firstname='Bickey' using firstname.charAt(1): " + ch);// i
		char ch1 = firstname.charAt(5);
		System.out.println("using charAt method on firstname='Bickey' using firstname.charAt(5): " + ch1);// y
		// substring method
		String substring = firstname.substring(3, 6);// starts from index 3 and end at 6-1_>5
		System.out.println("using substring method on firstname='Bickey' using firstname.substring(3,6): " + substring);// key
	}

}
