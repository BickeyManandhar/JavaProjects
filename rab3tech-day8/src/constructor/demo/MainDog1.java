package constructor.demo;

public class MainDog1 {

	public static void main(String[] args) {
		//Overcome the limitations 
		//using parameterized constructor
		Dog1 d=new Dog1();
		System.out.println("------------");
		System.out.println("Name of dog: "+d.name);
		System.out.println("Number of eyes: "+d.eyes);
		System.out.println("Number of tail: "+d.tail);
		System.out.println("Color of dog: "+d.color);
		d.run();
		
		System.out.println("------------");
		Dog1 d1=new Dog1("Shawn");// string n
		System.out.println("Name of dog: "+d1.name);
		d1.bark();
		
		System.out.println("------------");
		Dog1 d2=new Dog1(3);// int e
		System.out.println("Number of eyes: "+d2.eyes);
		d2.bark();
		
		System.out.println("------------");
		Dog1 d3=new Dog1("Shawn",2); //string n, int e
		System.out.println("Name of dog: "+d3.name);
		System.out.println("Number of eyes: "+d3.eyes);
		d3.bark();
		
		System.out.println("------------");
		Dog1 d4=new Dog1(1, "black");//int t, string color
		System.out.println("Number of tail: "+d4.tail);
		System.out.println("Color of dog: "+d4.color);
		d4.bark();
		
		System.out.println("------------");
		Dog1 d44=new Dog1("Bruno", "brown");//string n, string color
		System.out.println("Name of dog: "+d44.name);
		System.out.println("Color of dog: "+d44.color);
		d44.bark();
		
		System.out.println("------------");
		Dog1 d5=new Dog1("Gary", 3, 2);//string n, int e, int tail
		System.out.println("Name of dog: "+d5.name);
		System.out.println("Number of eyes: "+d5.eyes);
		System.out.println("Number of tail: "+d5.tail);
		d5.bark();
		
		System.out.println("------------");
		Dog1 d6=new Dog1(3,1,"blue");//int e, int t, string c
		System.out.println("Number of eyes: "+d6.eyes);
		System.out.println("Number of tail: "+d6.tail);
		System.out.println("Color of dog: "+d6.color);
		d6.bark();
		
		System.out.println("------------");
		Dog1 d7=new Dog1("Gary", 1, "grey");//string n, int t, String c
		System.out.println("Name of dog: "+d7.name);
		System.out.println("Number of tail: "+d7.tail);
		System.out.println("Color of dog: "+d7.color);
		d7.bark();
		
		System.out.println("------------");
		Dog1 d8=new Dog1(2,"Spitz",1,"white");//int e, string n, int t, string c
		System.out.println("Name of dog: "+d8.name);
		System.out.println("Number of eyes: "+d8.eyes);
		System.out.println("Number of tail: "+d8.tail);
		System.out.println("Color of dog: "+d8.color);
		d8.bark();
		
		System.out.println("------------");
		Dog1 d9=new Dog1("Spitz",1,"white",2);//string n, int t, string c,int e
		System.out.println("Name of dog: "+d9.name);
		System.out.println("Number of eyes: "+d9.eyes);
		System.out.println("Number of tail: "+d9.tail);
		System.out.println("Color of dog: "+d9.color);
		d9.bark();
		
		System.out.println("------------");
		Dog1 d10=new Dog1("Shawn",1,0,"White");//sting n, int t, int e, string c
		System.out.println("Name of dog: "+d10.name);
		System.out.println("Number of eyes: "+d10.eyes);
		System.out.println("Number of tail: "+d10.tail);
		System.out.println("Color of dog: "+d10.color);
		d10.bark();
		
		System.out.println("------------");
		Dog1 d11=new Dog1(2,1,"Tom","Blue");//int e, int t, string n, string c
		System.out.println("Name of dog: "+d11.name);
		System.out.println("Number of eyes: "+d11.eyes);
		System.out.println("Number of tail: "+d11.tail);
		System.out.println("Color of dog: "+d11.color);
		d11.bark();
		
		System.out.println("------------");
		Dog1 d12=new Dog1("Maggie","Blue",2,1);//string n, string c, int e, int t
		System.out.println("Name of dog: "+d12.name);
		System.out.println("Number of eyes: "+d12.eyes);
		System.out.println("Number of tail: "+d12.tail);
		System.out.println("Color of dog: "+d12.color);
		d12.bark();

	}

}
