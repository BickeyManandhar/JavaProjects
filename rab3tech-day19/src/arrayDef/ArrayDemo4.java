package arrayDef;

public class ArrayDemo4 {

	public static void main(String[] args) {
		int multiplybytwo=2;
		int num[]=new int[] {1,3,4,5};
		for(int i=0;i<num.length;i++) {
			System.out.println("The " +(i+1)+" element of array has value: "+num[i]);
		}
		System.out.println("---------------------------------------------------------------");
		System.out.println("Updated value after multiplied by 2:\n");
		for(int i=0;i<num.length;i++) {
			num[i]=num[i]*multiplybytwo;
			System.out.println("The " +(i+1)+" element of array after multiplying by two: "+num[i]);
		}
	}

}
