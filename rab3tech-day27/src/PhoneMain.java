import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhoneMain {

	public static void main(String[] args) {
		Phone p1 = new Phone(1200, "Apple", "Black");
		Phone p2 = new Phone(950, "Oppo", "Grey");
		Phone p3 = new Phone(1000, "Samsung", "White");// content same as p6
		Phone p4 = new Phone(600, "Nokia", "Blue");
		Phone p5 = new Phone(870, "Motorolla", "Brown");
		Phone p6 = new Phone(1000, "Samsung", "White");// content same as p3

		List<Phone> alp = new ArrayList<>();
		alp.add(p1);
		alp.add(p2);
		alp.add(p3);
		alp.add(p4);
		alp.add(p5);
		alp.add(p6);

		System.out.println("\n-------------- ArrayList --------------\n");
		System.out.println(alp + "\n");

		System.out.println("\n-------------- Searching p3 on ArrayList alp --------------\n");
		System.out.println("Contains p3?: " + alp.contains(p3) + "\n");

		System.out
				.println("\n-------------- ArrayList After Sorting based on Price in ascending order --------------\n");
		Collections.sort(alp);
		System.out.println(alp + "\n");

		System.out.println(
				"\n-------------- ArrayList After Sorting based on Brand initials in ascending order --------------\n");
		Collections.sort(alp, new SortByBrand());
		System.out.println(alp + "\n");

		System.out.println(
				"\n-------------- ArrayList After Sorting based on Color initials in ascending order --------------\n");
		Collections.sort(alp, new SortByColor());
		System.out.println(alp + "\n");

		System.out.println("-------------- equals() method concept after over loading --------------");
		System.out.println("Is p3 equals to p6 after the equals() method is over loaded? " + p3.equals(p6)+"\n"); // false -
																												// (because
																												// the
																												// method
																												// is
																												// taking
																												// reference
																												// before
																												// the
																												// method
																												// is
																												// over
																												// loaded
		// true - returned true later because it checks the content when equals method
		// is over loaded

		System.out.println("\n-------------- hashCode() method concept after over loading --------------\n");
		System.out.println(p3.hashCode());
		System.out.println(p6.hashCode());
		// before overloading the hashCode() method, they had different hashcode even
		// though they has same content, but after overloading, they return same
		// hashcode.

	}

}
