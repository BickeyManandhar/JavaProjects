package methodOverloading;

//method overloading takes place in a same class
//name of method will be same, but signature of method should be different
//changing the return type and keeping the same name and same signature will not work
//instead we can change the return type, use same name and change the parameters

public class Fruit {
	public void sweet() {//no parameter
		System.out.println("This fruit is very sweet.");
	}
	public void sweet(int x) { // same name sweet but different signature i.e. the one before has empty parameter but this has int x
		System.out.println("This fruit is "+x+" % sweeter than before.");
	}
	public int sweet(int x, int y) {
		System.out.println("This fruit is "+x+" % sweeter than 1st one and "+y+" % sweeter than the 2nd.");
		return 0;
	}
	
	public static void main(String[] args) {
		Fruit fr=new Fruit();
		fr.sweet();
		fr.sweet(10);
		fr.sweet(10,20);
	}
}
