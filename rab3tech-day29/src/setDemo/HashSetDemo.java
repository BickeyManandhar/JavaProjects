package setDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// Set is un-ordered
		Set<Integer> hs = new HashSet<>();
		hs.add(26);
		hs.add(3);
		hs.add(9);
		hs.add(7);
		hs.add(5);
		hs.add(9);
		hs.add(67);
		hs.add(54);
		hs.add(3);// duplicate value is not allowed

		Set<String> hs1 = new HashSet<>();
		hs1.add("Bickey");
		hs1.add("Biki");
		hs1.add("Bicky");
		hs1.add("Biky");
		hs1.add("Bickey");// duplicate value not allowed

		System.out.println("---------------- HashSet with Integer value----------------");
		System.out.println("hs: " + hs);
		System.out.println("\n-----------------------------------------\n");
		System.out.println("---------------- HashSet with String value----------------");
		System.out.println("hs1: " + hs1);
		System.out.println("\n-----------------------------------------\n");

		// Search operation
		System.out.println("**************** Search Operation on hs and hs1 ****************");
		System.out.println("Contains 5 on hs? == " + hs.contains(5)); // true
		System.out.println("Contains Bickey on hs1? == " + hs1.contains("Bickey")); // true
		

		// iterating data using for each loop
		System.out.println("\nIterating data of hs using for each loop: \n");
		for (Integer temp : hs) {
			System.out.println(temp);
		}

		// iterating data using for each loop
		System.out.println("\nIterating data of hs1 using for each loop: \n");
		for (String temp : hs1) {
			System.out.println(temp);
		}

		// iterating data using Iterator Interface provided by Collection framework
		System.out.println("\nIterating data of hs using Iterator Interface: \n");
		Iterator<Integer> ite1 = hs.iterator();
		while (ite1.hasNext()) {// hasNext()__> this returns true if the iteration has more elements. (In other
								// words, returns true if next would return an element rather than throwing an
								// exception.
			System.out.println(ite1.next()); // this prints all the data on the array list until the above value is true
		}
		System.out.println("\n----------------------------------------\n");

		// iterating data using Iterator Interface provided by Collection framework
		System.out.println("\nIterating data of hs1 using Iterator Interface: \n");
		Iterator<String> ite2 = hs1.iterator();
		while (ite2.hasNext()) {// hasNext()__> this returns true if the iteration has more elements. (In other
								// words, returns true if next would return an element rather than throwing an
								// exception.
			System.out.println(ite2.next()); // this prints all the data on the array list until the above value is true
		}
		System.out.println("\n----------------------------------------\n");

		List<Integer> ls = new ArrayList<>();
		ls.add(26);
		ls.add(3);
		ls.add(9);
		ls.add(7);
		ls.add(5);
		ls.add(3);// duplicate value is allowed
		System.out.println("---------------- Arraylist ----------------");
		System.out.println(ls);
		Collections.sort(ls);
		System.out.print("Sorted: ");
		System.out.println(ls);
	}

}
