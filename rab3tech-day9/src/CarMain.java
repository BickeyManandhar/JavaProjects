
public class CarMain {

	public static void main(String[] args) {
		Car cr1=new Car();
		System.out.println("Model year: "+cr1.model_year);
		System.out.println("Car Number: "+cr1.car_num);
		System.out.println("Car Color: "+cr1.color);
		System.out.println("Car Type: "+cr1.type);
		System.out .println("--------------------------");
		
		Car cr2=new Car(2001,"D4E5F6","Silver","Car Type 2");
		System.out.println("Model year: "+cr2.model_year);
		System.out.println("Car Number: "+cr2.car_num);
		System.out.println("Car Color: "+cr2.color);
		System.out.println("Car Type: "+cr2.type);
		System.out .println("--------------------------");
		
		Car cr3=new Car(2002);
		System.out.println("Model year: "+cr3.model_year);
		System.out .println("--------------------------");
		
		Car cr4=new Car("G7H8I9");
		System.out.println("Car Number: "+cr4.car_num);
		System.out .println("--------------------------");
		
		Car cr5=new Car(2003,"J10K11L12");
		System.out.println("Model year: "+cr5.model_year);
		System.out.println("Car Number: "+cr5.car_num);
		System.out .println("--------------------------");
		
		Car cr6=new Car("Blue","Car Type 3");
		System.out.println("Car Color: "+cr6.color);
		System.out.println("Car Type: "+cr6.type);
		System.out .println("--------------------------");

	}

}
