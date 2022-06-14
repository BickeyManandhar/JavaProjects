package inheritanceDemo;
//this is sub class/ child class
public class DogNew extends Dog{
	//sleep()+run()+walk()+bark()
	public void character() {
		System.out.println("Dog's name is "+name+". It has "+tail+" tail and "+leg+" legs.");
	}
	public void sleep() {
		System.out.println("Dog can sleep. ");
	}
}
