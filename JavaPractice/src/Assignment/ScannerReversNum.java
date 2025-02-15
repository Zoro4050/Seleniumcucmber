package Assignment;

import java.util.Scanner;

public class ScannerReversNum {

	public static int reversenumber2(int number) {
		int reverse = 0;

		for (; number != 0; number = number / 10) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int num1 = snc.nextInt();
		snc.close();
		num1 = reversenumber2(num1);

		System.out.println("Reverse number = " + num1);
	}

}
