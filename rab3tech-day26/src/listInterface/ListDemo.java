package listInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		//ArrayList<String> ls= new ArrayList<>(); below is the better approach to write same code
		
		List<String> ls1= new ArrayList<>();
		ls1.add("Biky");
		ls1.add("Bikki");
		ls1.add("Biky");
		ls1.add("Beekee");
		System.out.print("ArrayList: ");
		System.out.println(ls1);
		System.out.println("\n----------------------------------------\n");
		
		List<String> ls2=new LinkedList<>();
		ls2.add("Biky");
		ls2.add("Bikki");
		ls2.add("Biky");
		ls2.add("Beekee");
		System.out.print("LinkedList: ");
		System.out.println(ls2);
		System.out.println("\n----------------------------------------\n");
		
		List<String> ls3=new Vector<>();
		ls3.add("Biky");
		ls3.add("Bikki");
		ls3.add("Biky");
		ls3.add("Beekee");
		System.out.print("Vector: ");
		System.out.println(ls3);
		System.out.println("\n----------------------------------------\n");
		
		List<String> ls4=new Stack<>();
		ls4.add("Biky");
		ls4.add("Bikki");
		ls4.add("Biky");
		ls4.add("Beekee");
		System.out.print("Stack: ");
		System.out.println(ls4);
		System.out.println("\n----------------------------------------\n");
		

	}

}
