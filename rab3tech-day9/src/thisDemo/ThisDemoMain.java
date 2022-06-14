package thisDemo;

public class ThisDemoMain {

	public static void main(String[] args) {
		// we did not initialized anything so int type will have value 0 and string type will be null
		ThisDemo td1=new ThisDemo();
		System.out.println(td1.num1);
		System.out.println(td1.num2);
		System.out.println(td1.str);
		System.out.println("------------------");

		
		ThisDemo td2=new ThisDemo(1,2,"Bickey");
		System.out.println(td2.num1);
		System.out.println(td2.num2);
		System.out.println(td2.str);
		System.out.println("------------------");
		
		ThisDemo td3=new ThisDemo(3);
		System.out.println(td3.num1);
		System.out.println("------------------");
		
		ThisDemo td4=new ThisDemo("Biki");
		System.out.println(td4.str);
		System.out.println("------------------");
		
		ThisDemo td5=new ThisDemo(4,"Bix");
		System.out.println(td5.num1);
		System.out.println(td5.str);
		System.out.println("------------------");
		
		ThisDemo td6=new ThisDemo("Bic",5);
		System.out.println(td6.str);
		System.out.println(td6.num2);
		System.out.println("------------------");
	}

}
