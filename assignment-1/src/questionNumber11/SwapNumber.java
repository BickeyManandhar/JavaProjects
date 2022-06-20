package questionNumber11;

public class SwapNumber {

	public static void main(String[] args) {
		int x=1;
	      int y=2;
	      System.out.println("Value before swap -> x = " +x+" and y = "+y);
	      x=x+y;
	      y=x-y;
	      x=x-y;
	      System.out.println("Value after swap -> x = " +x+" and y = "+y);
	}

}
