import java.util.Objects;

public class Phone {
	int price;
	String brand;
	String color;
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Phone(int price, String brand, String color) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
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
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, color, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color) && price == other.price;
	}


	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return "Phone [price=" + price + ", brand=" + brand + ", color=" + color + "]";
	}


	public void setColor(String color) {
		this.color = color;
	}


	
	
	
}
