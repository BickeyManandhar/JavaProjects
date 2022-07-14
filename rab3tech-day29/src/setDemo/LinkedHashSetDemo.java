package setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//Set is un-ordered
				Set<Integer> hs=new LinkedHashSet<>();
				hs.add(26);
				hs.add(3);
				hs.add(9);
				hs.add(7);
				hs.add(5);
				hs.add(3);// duplicate value is not allowed
				System.out.println("---------------- LinkedHashSet with integer value ----------------");
				System.out.println(hs);
				
				Set<String> hs1 = new LinkedHashSet<>();
				hs1.add("Bickey");
				hs1.add("Biki");
				hs1.add("Bicky");
				hs1.add("Biky");
				hs1.add("Bickey");// duplicate value not allowed
				System.out.println("---------------- LinkedHashSet with string value ----------------");
				System.out.println(hs1);
				
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
