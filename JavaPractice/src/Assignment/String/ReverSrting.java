package Assignment.String;

import java.util.Scanner;

public class ReverSrting {
	public static String reverse(String str) {
		// Base case: if the string is empty, return the string itself
		if (str.isEmpty()) {
			return str;
		}
		// Recursive case: reverse the substring from the second character to the end,
		// and then add the first character at the end
		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter String:");
		String input = scr.nextLine();
		String reversed = reverse(input);
		System.out.println("Original String: " + input);
		System.out.println("Reversed String: " + reversed);
		scr.close();
	}
}
