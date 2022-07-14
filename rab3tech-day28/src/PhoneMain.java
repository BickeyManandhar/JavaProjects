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

		System.out.println(p3.hashCode() + " " + p6.hashCode()); // it gives different hashcode even when content is
																	// same because this is the class we made by
																	// ourself and it will only have same hashCode if we
																	// override it(which we did so same hashcode will be
																	// shown). In wrapper class java developer
																	// already overridden so we do not have to. but in
																	// self made class we have to

	}

}