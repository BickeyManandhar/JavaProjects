package interfacedemo;

public class MainClass {

	public static void main(String[] args) {
		Mother m=new Child();
		Father f=new Child();
		Child c=new Child();
		m.tallheight();//This method is left blank on child class so it prints nothing
		m.dryskin();
		System.out.println("-----------------------");
		f.shortheight();
		System.out.println("-----------------------");
		f.oilyskin();
		System.out.println("-----------------------");
		c.mediumheight();
		

	}

}
