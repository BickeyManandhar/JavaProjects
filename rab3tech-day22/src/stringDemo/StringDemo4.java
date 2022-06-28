package stringDemo;

public class StringDemo4 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("abcde");
		System.out.println("Before any method is applied we have string: " + str + " \n");
		System.out.println("------------------- After applying .append(fghij) method -------------------");
		str.append("fghij");// append data in existing str
		System.out.println(str);// abcdefghij
		System.out.println("------------------- After applying .delete(0,3) method -------------------");
		str.delete(0, 3);// delete data in last str, here it will include index 0 to (3-1)
		System.out.println(str);// defghij
		System.out.println("------------------- After applying .reverse() method -------------------");
		str.reverse();
		System.out.println(str);
		System.out.println("------------------- After applying .insert(0,abc) method -------------------");
		str.insert(0,"abc");// this inserts abc starting from index 0
		System.out.println(str);// abcdefghij
	}

}
