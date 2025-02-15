package javaRevision;

public class reversNumberMethod {

	public static void main(String[] args) {
		System.out.println(reverseNumber(123));
		// while loop
		System.out.println("using while loop" + usingWhlieLoop(123));
	}

	public static int reverseNumber(int a) {
		int reverse = 0;
		for (; a != 0; a /= 10) {
			int reminder = a % 10;
			reverse = reverse * 10 + reminder;
		}
		return reverse;
	}

	public static int usingWhlieLoop(int a) {
		int reverse = 0;
		while (a != 0) {
			int reminder = a % 10; // modulus gives us the reminder, so after dividing by
									// 10 we get last digit as reminder

			reverse = reverse * 10 + reminder; // here we multiply the last number and add the reminder to reverse
			a /= 10; // removing the last digit
		}
		return reverse;
	}
}
