package staticVariable;

public class MobileVarMain {

	public static void main(String[] args) {	
		//here name is non-static and color is static. When a variable is static type, then a single copy of variable is created and shared among all the objects at class level.
		MobileVar mv1=new MobileVar("Nokia","Black");
		mv1.info(); // this gives Nokia Nokia Black Black
		System.out.println("---------------------");
		
		MobileVar mv2=new MobileVar("Apple","Red");
		mv2.info(); // this gives Apple Apple and for the color since its static ,it takes the latest parameter that is in the last object which is Red Red
		System.out.println("---------------------");
		mv1.info(); // this gives Nokia Nokia and for the color since its static , it takes the latest parameter that is in the last object which is Red Red
		System.out.println("---------------------");
		
		MobileVar mv3=new MobileVar("Samsung","Blue");
		mv3.info(); // this gives Samsung Samsung Blue Blue
		System.out.println("---------------------");
		mv2.info(); // this gives Apple Apple and for the color since its static , it takes the latest parameter that is in the last object which is Blue Blue
		System.out.println("---------------------");
		mv1.info(); //this gives Nokia Nokia and for the color since its static , it takes the latest parameter that is in the last object which is Blue Blue
		System.out.println("---------------------");
		
		MobileVar mv4=new MobileVar("Motorola","White");
		mv4.info(); // this gives Motorolla Motorolla White White
		System.out.println("---------------------");
		mv2.info(); // this gives Apple Apple and for the color since its static , it takes the latest parameter that is in the last object which is White White
		System.out.println("---------------------");
		mv1.info(); // this gives Nokia Nokia and for the color since its static , it takes the latest parameter that is in the last object which is White White
		System.out.println("---------------------");
		mv3.info();// // this gives Samsung Samsung and for the color since its static , it takes the latest parameter that is in the last object which is White White
		System.out.println("---------------------");

	}

}
