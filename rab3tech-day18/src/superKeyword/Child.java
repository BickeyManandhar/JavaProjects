package superKeyword;

public class Child extends Parent{
	@Override
	public void walk() {
		System.out.println("Child can walk.");
	}
	@Override
	public void talk() {
		System.out.println("Child can talk.");
	}
	public void demo() {
		walk();
		this.walk();//instance
		super.walk();
		talk();
	}
}
