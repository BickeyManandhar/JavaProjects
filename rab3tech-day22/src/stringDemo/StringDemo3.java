package stringDemo;

// compareTo() method demo
public class StringDemo3 {

	public static void main(String[] args) {
		String name1 = "Bickey";
		String name2 = "Bickey";
		System.out.println(name1.compareTo(name2));// returns 0

		String name3 = "Bickeyy";
		String name4 = "Bickey";
		System.out.println(name3.compareTo(name4));// returns 1

		String name5 = "Bickeyey";
		String name6 = "Bickey";
		System.out.println(name5.compareTo(name6));// returns 2

		String name7 = "Bickey";
		String name8 = "Bickeyy";
		System.out.println(name7.compareTo(name8));// returns -1

		String name9 = "Bickey";
		String name10 = "Bickeyey";
		System.out.println(name9.compareTo(name10));// returns -2
	}

}
