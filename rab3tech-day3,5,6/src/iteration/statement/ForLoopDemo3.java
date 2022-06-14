package iteration.statement;

public class ForLoopDemo3 {

	public static void main(String[] args) {
		// printing table from 2 to 10
		for(int i = 2; i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(i+" * "+j+" = ");
				System.out.println(i*j);
			}
			System.out.println("-------------------------------");
		}
		

	}

}
