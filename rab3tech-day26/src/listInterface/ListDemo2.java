package listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo2 {

	public static void main(String[] args) {
		// ArrayList<String> ls1= new ArrayList<>(); below is the better approach to
		// write same code

		List<String> ls1 = new ArrayList<>();
		ls1.add("Biky");
		ls1.add("Abhram");
		ls1.add("Tom");
		ls1.add("Ankit");
		System.out.print("ArrayList: ");
		System.out.println(ls1);
		// Search operation
		System.out.println("**************** Search Operation ****************");
		System.out.println("Contains Biky? == " + ls1.contains("Biky")); // true
		System.out.println("Contains Bicky? == " + ls1.contains("Bicky")); // false

		// sort operation
		System.out.println("\n**************** Sort Operation ****************");
		System.out.println("\nSorting operation on ls1: \n");
		Collections.sort(ls1);
		System.out.println(ls1);
		System.out.println("\n----------------------------------------\n");

		// iterating data using for each loop
		System.out.println("\nIterating data of ls1 using for each loop: \n");
		for (String temp : ls1) {
			System.out.println(temp);
		}

		// iterating data using Iterator Interface provided by Collection framework
		System.out.println("\nIterating data of ls1 using Iterator Interface: \n");
		Iterator<String> ite1 = ls1.iterator();
		while (ite1.hasNext()) {// hasNext()__> this returns true if the iteration has more elements. (In other
								// words, returns true if next would return an element rather than throwing an
								// exception.
			System.out.println(ite1.next()); // this prints all the data on the array list until the above value is true
		}
		System.out.println("\n----------------------------------------\n");

		List<String> ls2 = new LinkedList<>();
		ls2.add("Bickey");
		ls2.add("John");
		ls2.add("Rohan");
		ls2.add("Bishal");
		System.out.print("LinkedList: ");
		System.out.println(ls2);
		System.out.println("\n----------------------------------------\n");

		// Search operation
		System.out.println("**************** Search Operation ****************");
		System.out.println("Contains Biky? == " + ls2.contains("Biky")); // true
		System.out.println("Contains Bicky? == " + ls2.contains("Bicky")); // false

		// sort operation
		System.out.println("\n**************** Sort Operation ****************");
		System.out.println("\nSorting operation on ls2: \n");
		Collections.sort(ls2);
		System.out.println(ls2);
		System.out.println("\n----------------------------------------\n");

		// iterating data using for each loop
		System.out.println("\nIterating data of ls2 using for each loop: \n");
		for (String temp : ls2) {
			System.out.println(temp);
		}

		// iterating data using Iterator Interface provided by Collection framework
		System.out.println("\nIterating data of ls2 using Iterator Interface: \n");
		Iterator<String> ite2 = ls2.iterator();
		while (ite2.hasNext()) {// hasNext()__> this returns true if the iteration has more elements. (In other
								// words, returns true if next would return an element rather than throwing an
								// exception.
			System.out.println(ite2.next()); // this prints all the data on the array list until the above value is true
		}
		System.out.println("\n----------------------------------------\n");

		List<String> ls3 = new Vector<>();
		ls3.add("Biky");
		ls3.add("Susmita");
		ls3.add("Ricky");
		ls3.add("Prabesh");
		System.out.print("Vector: ");
		System.out.println(ls3);
		System.out.println("\n----------------------------------------\n");

		// Search operation
		System.out.println("**************** Search Operation ****************");
		System.out.println("Contains Biky? == " + ls3.contains("Biky")); // true
		System.out.println("Contains Bicky? == " + ls3.contains("Bicky")); // false

		// sort operation
		System.out.println("\n**************** Sort Operation ****************");
		System.out.println("\nSorting operation on ls3: \n");
		Collections.sort(ls3);
		System.out.println(ls3);
		System.out.println("\n----------------------------------------\n");

		// iterating data using for each loop
		System.out.println("\nIterating data of ls3 using for each loop: \n");
		for (String temp : ls3) {
			System.out.println(temp);
		}

		// iterating data using Iterator Interface provided by Collection framework
		System.out.println("\nIterating data of ls3 using Iterator Interface: \n");
		Iterator<String> ite3 = ls3.iterator();
		while (ite3.hasNext()) {// hasNext()__> this returns true if the iteration has more elements. (In other
								// words, returns true if next would return an element rather than throwing an
								// exception.
			System.out.println(ite3.next()); // this prints all the data on the array list until the above value is true
		}
		System.out.println("\n----------------------------------------\n");

		List<String> ls4 = new Stack<>();
		ls4.add("Tonny");
		ls4.add("Ramesh");
		ls4.add("Biky");
		ls4.add("Suresh");
		System.out.print("Stack: ");
		System.out.println(ls4);
		System.out.println("\n----------------------------------------\n");

		// Search operation
		System.out.println("**************** Search Operation ****************");
		System.out.println("Contains Biky? == " + ls4.contains("Biky")); // true
		System.out.println("Contains Bicky? == " + ls4.contains("Bicky")); // false

		// sort operation
		System.out.println("\n**************** Sort Operation ****************");
		System.out.println("\nSorting operation on ls4: \n");
		Collections.sort(ls4);
		System.out.println(ls4);
		System.out.println("\n----------------------------------------\n");

		// iterating data using for each loop
		System.out.println("\nIterating data of ls4 using for each loop: \n");
		for (String temp : ls4) {
			System.out.println(temp);
		}

		// iterating data using Iterator Interface provided by Collection framework
		System.out.println("\nIterating data of ls4 using Iterator Interface: \n");
		Iterator<String> ite4 = ls4.iterator();
		while (ite4.hasNext()) {// hasNext()__> this returns true if the iteration has more elements. (In other
								// words, returns true if next would return an element rather than throwing an
								// exception.
			System.out.println(ite4.next()); // this prints all the data on the array list until the above value is true
		}
		System.out.println("\n----------------------------------------\n");

	}

}
