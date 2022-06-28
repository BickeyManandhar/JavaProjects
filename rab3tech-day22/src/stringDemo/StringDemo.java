package stringDemo;

public class StringDemo {

	public static void main(String[] args) {
		// String literals stored in string constant pool has same address if content is
		// same
		String name = "Bickey";
		String name1 = "Bickey";
		System.out.print("Bickey==Bickey ? if they are in string constant pool? : ");
		System.out.println(name == name1); // == is comparing based on reference and strings name and name 1 has same
											// reference
		System.out.print("Bickey.equals(Bickey) ? if they are in string constant pool? : ");
		System.out.println(name.equals(name1));// this is comparing content but not the address

		// String objects stored in Heap has different address
		String name2 = new String("Bikki");
		String name3 = new String("Bikki");
		System.out.print("Bikki==Bikki ? if they are in Heap? : ");
		System.out.println(name2 == name3); // == is comparing based on reference and strings name2 and name 3 has same
											// reference
		System.out.print("Bikki.equals(Bikki) ? if they are in Heap? : ");
		System.out.println(name2.equals(name3));// this is comparing content but not the address
	}

}
