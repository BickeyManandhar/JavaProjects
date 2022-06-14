package jump.statement;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i=0; i<=10;i++) {
			if(i==1 || i== 3) {
				continue;//skips 1 and 3 and prints the rest
			}
			System.out.println(i);
		}

	}

}
