package superKeyword;

public class VarSub extends VarSuper{
String name="Bix";
	
	public void show() {
		System.out.println("Name=="+name);//Bix
		System.out.println("this.Name=="+this.name);//Bix
		System.out.println("Color=="+color);//Blue
		System.out.println("this.Color=="+this.color);//Blue
		System.out.println("super.name=="+super.name);//Bickey
		super.show();//Bickey
					//Blue
		
	}
}
