import java.util.Comparator;

public class SortByColor implements Comparator<Phone>{

	@Override
	public int compare(Phone o1, Phone o2) {
		int x= (o1.color).compareTo(o2.color);//ascending order
		//int x= (o2.color).compareTo(o1.color);//descending order
		return x;
	}

	

}
