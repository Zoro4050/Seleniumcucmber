package Assignment.String;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter String 1 :");
		String s1 = scr.nextLine();
		System.out.println("Enter String 2 :");
		String s2 = scr.nextLine();

		boolean result = Anagram(s1, s2);

		if (result == true) {
			System.out.println("The given strings are Anagram");
		}

		else {
			System.out.println("The given strings are not Anagram");
		}
		scr.close();
	}

	public static boolean Anagram(String str1, String str2) {
		str1 = str1.toLowerCase().replaceAll("\\s", "");
		str2 = str2.toLowerCase().replaceAll("\\s", "");

		if (str1.length() != str2.length()) {

			return false;
		}

		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		return Arrays.equals(c1, c2);
	}

}
