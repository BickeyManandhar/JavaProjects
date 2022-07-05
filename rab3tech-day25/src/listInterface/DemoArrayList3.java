package listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * It is dynamic - no need to specify array size.
 * Duplicate value is allowed.
 * Elements are ordered.
 * hashcode() is not allowed - (will discuss later)
 */
public class DemoArrayList3 {

	public static void main(String[] args) {
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

		// iterating data using for each loop
		System.out.println("\nIterating data of st using for each loop: \n");
		for (String temp : st) {
			System.out.println(temp);
		}

		// iterating data using Iterator Interface provided by Collection framework
		System.out.println("\nIterating data of st using Iterator Interface: \n");
		Iterator<String> ite = st.iterator();
		while (ite.hasNext()) {// hasNext()__> this returns true if the iteration has more elements. (In other
								// words, returns true if next would return an element rather than throwing an
								// exception.
			System.out.println(ite.next()); // this prints all the data on the array list until the above value is true
		}
	}

}
