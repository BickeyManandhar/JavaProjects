package inheritanceDemo;

public class DogMain {

	public static void main(String[] args) {
		DogNew dm=new DogNew();// created object for sub/child class
		dm.run(); //method and definition coming from *sub class DogNew extended from super class i.e. Dog*
		dm.walk(); //method and definition coming from *sub class DogNew extended from super class i.e. Dog*
		dm.bark(); //method and definition coming from *sub class DogNew extended from super class i.e. Dog*
		dm.character(); //method and definition coming from *sub class DogNew extended from super class i.e. Dog*
		dm.sleep(); //method and definition coming from *sub class i.e. DogNew*

	}

}
