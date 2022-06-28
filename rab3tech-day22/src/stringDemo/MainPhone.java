package stringDemo;

public class MainPhone {

	public static void main(String[] args) {
		Phone p1 = new Phone();// default constructor
		// when we do not use toString() method, we have to print each get method
		// separately
		System.out.println("------------- Using getter method -------------");
		System.out.println("Year: " + p1.getYear());
		System.out.println("Price: " + p1.getPrice());
		System.out.println("Brand: " + p1.getBrand());
		System.out.println("Color: " + p1.getColor());

		// but when we use toString() method, one line code is enough
		System.out.println("------------- Using toString() method -------------");
		System.out.println(p1);

		Phone p2 = new Phone(2021, 1500, "iPhone 13 pro", "Sierra Blue");// parameterized constructor
		// when we do not use toString() method, we have to print each get method
		// separately
		System.out.println("\n");
		System.out.println("------------- Using getter method -------------");
		System.out.println("Year: " + p2.getYear());
		System.out.println("Price: " + p2.getPrice());
		System.out.println("Brand: " + p2.getBrand());
		System.out.println("Color: " + p2.getColor());

		// but when we use toString() method, one line code is enough
		System.out.println("------------- Using toString() method -------------");
		System.out.println(p2);
	}

}
