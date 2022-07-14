package setDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//Does not allow duplicate value
		//sorts in ascending order
		//Internally TreeSet uses R-B-Tree feature

		Set<Integer> hs=new TreeSet<>();
		hs.add(5);
		hs.add(3);
		hs.add(1);
		hs.add(4);
		hs.add(2);
		hs.add(3);// duplicate value is not allowed
		System.out.println("---------------- TreeSet with integer value ----------------");
		System.out.println("hs: "+hs);
		
		Set<String> hs1 = new TreeSet<>();
		hs1.add("A. January");
		hs1.add("E. May");
		hs1.add("C. March");
		hs1.add("B. Feburary");
		hs1.add("D. April");
		hs1.add("B. Feburary");// duplicate value not allowed
		System.out.println("---------------- TreeSet with string value ----------------");
		System.out.println("hs1: "+hs1);
		
		// Search operation
		System.out.println("**************** Search Operation on hs and hs1 ****************");
		System.out.println("Contains 0 on hs? == " + hs.contains(0)); // false
		System.out.println("Contains D. April on hs1? == " + hs1.contains("D. April")); // true

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
		System.out.println("\n----------------------------------------\n");

		// iterating data using Iterator Interface provided by Collection framework
		System.out.println("\nIterating data of hs using Iterator Interface: \n");
		Iterator<Integer> ite1 = hs.iterator();
		while (ite1.hasNext()) {// hasNext()__> this returns true if the iteration has more elements. (In other
								// words, returns true if next would return an element rather than throwing an
								// exception.
			System.out.println(ite1.next()); // this prints all the data on the array list until the above value is true
		}
		

		// iterating data using Iterator Interface provided by Collection framework
		System.out.println("\nIterating data of hs1 using Iterator Interface: \n");
		Iterator<String> ite2 = hs1.iterator();
		while (ite2.hasNext()) {// hasNext()__> this returns true if the iteration has more elements. (In other
								// words, returns true if next would return an element rather than throwing an
								// exception.
			System.out.println(ite2.next()); // this prints all the data on the array list until the above value is true
		}
		System.out.println("\n----------------------------------------\n");
		
	}

}
