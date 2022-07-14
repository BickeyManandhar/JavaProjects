package mapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, String> lhm = new LinkedHashMap<>();
		lhm.put("1", "Bickey");
		lhm.put("2", "Bickey"); // Value can be duplicated
		lhm.put(null, null); // we can have null in key and value
		lhm.put("3", null);
		System.out.println(lhm);
		System.out.println("\n------------------------------------------------\n");

	}

}
