package mapInterface;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String, String> tm = new TreeMap<>();
		tm.put("3", null);
		tm.put("9", "Charles");
		tm.put("1", "Bickey");
		tm.put("7", "Tim");
		tm.put("2", "Bickey"); // Value can be duplicated
		//tm.put(null, "abc");// In TreeMap we cannot have key as null value
		//tm.put(null, null); //  In TreeMap we cannot have key as null value
		System.out.println(tm);
		System.out.println("\n------------------------------------------------\n");

	}

}
