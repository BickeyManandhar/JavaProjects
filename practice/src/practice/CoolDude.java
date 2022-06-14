package practice;

public class CoolDude {

	public static void main(String[] args) {
		for(int i=100;i<=500; i++) {
			if(i%7==0 && i%11==0) {
				System.out.println("Cool Dudee");
			}
			else if(i%7==0) {
				System.out.println("Cool");
			}
			else if(i%11==0) {
				System.out.println("Dude");
			}
			else {
				System.out.println(i);
			}
			
		}

	}

}
