package practice;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter number");
		int number = scn.nextInt();
		sum(number);
		scn.close();
	}

	public static void sum(int num) {

		int sum = 0;

		while (num != 0) {
			int digit = num % 10;
			sum += digit;
			num /= 10;
		}
		System.out.println("Sum of digits = " + sum);
	}

}
