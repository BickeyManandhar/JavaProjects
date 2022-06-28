package stringDemo;
// Encapsulation concept to demonstrate toString method
public class Phone {
	private int year;
	private int price;
	private String brand;
	private String color;

	// default constructor
	public Phone() {
		super();
	}

	// parameterized constructor
	public Phone(int year, int price, String brand, String color) {
		super();
		this.year = year;
		this.price = price;
		this.brand = brand;
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Phone [year=" + year + ", price=" + price + ", brand=" + brand + ", color=" + color + "]";
	}

}
