
public class Car {
	int model_year=2000;
	String car_num="A1B2C3";
	String color="Black";
	String type="Car Type 1";
	
	public Car() {//default constructor
		
	}
	
	//parameterized constructors
	public Car(int m, String car, String c, String t) {
		model_year=m;
		car_num=car;
		color=c;
		type=t;
	}
	
	public Car(int m) {
		model_year=m;

	}
	public Car(String car) {
		car_num=car;
	}
	public Car(int m, String car) {
		model_year=m;
		car_num=car;
	}
	public Car(String c, String t) {
		color=c;
		type=t;
	}
}
