package questionNumber4;
import java.util.Scanner;
public class SimpleInterest2 {
	public float simpleinterst(float p, float t, float r) {
		float si= (float)(p*t*r)/100;
		return si;
	}
	public static void main(String[] args) {
		float pp;
		float tt;
		float rr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal: ");
		pp=sc.nextFloat();
		System.out.println("Enter the time: ");
		tt=sc.nextFloat();
		System.out.println("Enter the rate: ");
		rr=sc.nextFloat();
		SimpleInterest2 sim=new SimpleInterest2();
		System.out.println("The simple interest from the provided data is "+sim.simpleinterst(pp,tt,rr));

	}

}
