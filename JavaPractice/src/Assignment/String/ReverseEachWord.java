package Assignment.String;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter String:");

		String s1 = scr.nextLine();
		System.out.println("Reversed string :" + "\n" + ReverseStringWords(s1));
		scr.close();
	}

	public static String ReverseStringWords(String str) {
		String[] Words = str.split(" ");

		StringBuilder reversedString = new StringBuilder();

		for (String word : Words) {
			String reverseword = new StringBuilder(word).reverse().toString();
			reversedString.append(reverseword).append(" ");
		}
		return reversedString.toString().trim();
	}
}
