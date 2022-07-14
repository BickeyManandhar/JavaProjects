
public class HashCodeDemo {
//hashCode and memory location are different concept
	public static void main(String[] args) {
		String st1 = "Bickey";
		String st2 = "Bickey";
		System.out.println(st1.hashCode() + "   " + st2.hashCode());

		String st3 = new String("Bickey");
		System.out.println(st1.hashCode() + "   " + st2.hashCode() + "   " + st3.hashCode());// hashCode is calculated
																								// on the basis of the
																								// content
		System.out.println(st1.equals(st3));// -true- because java developers have already overridden hashcode and equal
											// method in wrapper class String. if we create our own class, it will show
											// false until we override the methods

	}

}
