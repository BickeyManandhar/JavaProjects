package mapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {

	// Set internally uses Map. So all the rules from set is applied here too.
	// Map is not ordered
	// Key must be unique where as value can be duplicated
	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<>();
		hm.put("15", "Tom");
		hm.put("1", "Bickey");
		hm.put("3", null);
		hm.put("10", "Tim");
		hm.put("2", "Bickey"); // Value can be duplicated
		// hm.put("1", "John"); // this is not allowed because Key cannot be duplicated
		hm.put(null, null); // we can have null in key and value
		// hm.put(null, "ABC"); // this is not allowed because Key cannot be duplicated
		System.out.println("hm: " + hm);
		System.out.println("\n------------------------------------------------\n");

		String st = hm.put("1", "Tom"); // we are changing the value of Key 1 from Bickey to Tom
		System.out.println("Updated value for Key 1: " + hm);

		System.out.println("-------- Printing Old value at key 1 --------");
		System.out.println(st); // this will print old data on key 1 since String cannot be changed
		System.out.println("\n------------------------------------------------\n");

		System.out.println("Print only keys");
		Set<String> keys = hm.keySet(); // keySet() method will get the key
		for (String temp : keys) {
			System.out.println(temp); 
		}
		System.out.println("\n-----------------------------------------------\n");

		System.out.println("------- Print only value -------");
		System.out.println("Values in hm: " + hm.values());// this only prints values
		Set<String> keys1 = hm.keySet(); // keySet() method will get the key
		System.out.println("Printing only values using for loop");
		for (String temp1 : keys1) {
			System.out.println(hm.get(temp1)); // get(key) will get value
			}
		System.out.println("\n-----------------------------------------------\n");
		
		System.out.println("Key   Value");
		System.out.println("---   -----");
		Set<String> keys2 = hm.keySet(); // keySet() method will get the key
		for (String temp2 : keys2) {
			System.out.println(temp2 + "  " + hm.get(temp2)); // get(key) will get value
		}
		
		System.out.println("\n----------------------- End of Program------------------------\n");

	}

}
