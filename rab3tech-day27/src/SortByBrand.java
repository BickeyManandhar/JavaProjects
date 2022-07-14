import java.util.Comparator;

public class SortByBrand implements Comparator<Phone>{

	@Override
	public int compare(Phone o1, Phone o2) {
		int x= (o1.brand).compareTo(o2.brand); //ascending order
		//int x= (o2.brand).compareTo(o1.brand); //descending order

		return x;
	}
	//to sort sorting we implement comparator interface in different class

}
