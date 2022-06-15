package practice;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word;
		System.out.print("Enter a word: ");
		word=sc.next();
		System.out.print("Reverse of word "+word+ " is ");
		for(int i=word.length()-1; i>=0;i--) {
			System.out.print(word.charAt(i));
		}
	}

}
 