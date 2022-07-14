package mapInterface;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {

	public static void main(String[] args) {
		Map<String, String> ht = new Hashtable<>();
		ht.put("2", "Bickey");
		ht.put("5", "John");
	//	ht.put("1", null);
	//	ht.put(null, "abc");
	//	ht.put(null, null);
		ht.put("6", "Tom");
		ht.put("9", "Jim");
		//map.put(null, null);

		System.out.println(ht);
	}

}
