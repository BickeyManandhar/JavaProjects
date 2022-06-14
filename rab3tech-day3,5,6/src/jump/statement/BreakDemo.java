package jump.statement;

public class BreakDemo {

	public static void main(String[] args) {
		for(int i=0; i<=10;i++) {
			if(i== 3) {
				break;//prints everything above 3 i.e. 0,1,2
			}
			System.out.println(i);
		}


	}

}
