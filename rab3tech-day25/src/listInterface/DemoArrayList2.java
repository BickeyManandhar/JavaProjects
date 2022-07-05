package listInterface;

import java.util.ArrayList;
import java.util.Collections;

/*
 * It is dynamic - no need to specify array size.
 * Duplicate value is allowed.
 * Elements are ordered.
 * hashcode() is not allowed - (will discuss later)
 */
public class DemoArrayList2 {

	public static void main(String[] args) {
		// creating empty ArrayList with String type
		System.out.print("ArrayList of type String: ");
		ArrayList<String> st = new ArrayList<String>();
		st.add("Biky");
		st.add("Bikki");
		st.add("Biky");
		st.add("Beekee");
		System.out.println(st);
		System.out.println("----------------------------------------");

		// creating empty ArrayList with Integer type
		System.out.print("ArrayList of type Integer: ");
		ArrayList<Integer> num = new ArrayList<Integer>();
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

		// Search operation
		System.out.println("**************** Search Operation ****************");
		System.out.println("Contains Biky? == " + st.contains("Biky")); // true
		System.out.println("Contains Bicky? == " + st.contains("Bicky")); // false
		System.out.println("Contains 1? == " + num.contains(1)); // false
		System.out.println("Contains 0? == " + num.contains(0)); // true
		System.out.println("Contains A? == " + ch.contains('A')); // false
		System.out.println("Contains B? == " + ch.contains('B')); // true

		// sort operation
		System.out.println("\n**************** Sort Operation ****************");
		System.out.println("\nSorting operation on st: \n");
		Collections.sort(st);
		System.out.println(st);
		System.out.println("\nSorting operation on num: \n");
		Collections.sort(num);
		System.out.println(num);
		System.out.println("\nSorting operation on ch: \n");
		Collections.sort(ch);
		System.out.println(ch);
	}

}
