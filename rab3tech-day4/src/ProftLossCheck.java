import java.util.Scanner;

public class ProftLossCheck {

	public static void main(String[] args) {
		float cost_price;
		float selling_price;
		float profit;
		float loss;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost price: ");
		cost_price=sc.nextFloat();
		System.out.println("Enter the selling price: ");
		selling_price=sc.nextFloat();
		profit=selling_price-cost_price;//SP>CP
		loss=cost_price-selling_price;//CP>SP
		if(profit<0) {
			System.out.println("The shopkeeper is in loss of " +loss);
		}
		else if(profit==0) {
		System.out.println("The shopkeeper is neither in loss nor in profit.");
		}
		else {
			System.out.println("The shopkeeper is in profit of "+profit);

	}

	}

}
