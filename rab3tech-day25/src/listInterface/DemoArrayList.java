package listInterface;

import java.util.ArrayList;

/*
 * It is dynamic - no need to specify array size.
 * Duplicate value is allowed.
 * Elements are ordered.
 * hashcode() is not allowed - (will discuss later)
 */
public class DemoArrayList {

	public static void main(String[] args) {
		// creating empty ArrayList without defining its type
		ArrayList list = new ArrayList();
		// add method let us to add elements in the ArrayList
		System.out.print("General ArrayList: ");
		list.add("Bickey"); // String
		list.add("Biki"); // String
		list.add(1); // integer
		list.add(2); // integer
		list.add('B'); // character
		System.out.println(list); // Array is collection of same type of data and this is not following it
		System.out.println("----------------------------------------");

		// creating empty ArrayList with String type
		System.out.print("ArrayList of type String: ");
		ArrayList<String> st = new ArrayList<>();
		st.add("Biky");
		st.add("Bikki");
		st.add("Biky");
		st.add("Beekee");
		System.out.println(st);
		System.out.println("----------------------------------------");

		// creating empty ArrayList with Integer type
		System.out.print("ArrayList of type Integer: ");
		ArrayList<Integer> num = new ArrayList<>();
		num.add(55);
		num.add(0);
		num.add(865);
		num.add(822);
		System.out.println(num);
		System.out.println("----------------------------------------");

		// creating empty ArrayList with Character type
		System.out.print("ArrayList of type Character: ");
		ArrayList<Character> ch = new ArrayList<>();
		ch.add('B');
		ch.add('I');
		ch.add('C');
		ch.add('K');
		ch.add('E');
		ch.add('Y');
		System.out.println(ch);
		System.out.println("----------------------------------------");

	}

}
