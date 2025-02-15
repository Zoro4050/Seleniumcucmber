package Assignment;

import java.util.Scanner;

public class ScannerFactorsofnumber {

	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num1 = snc.nextInt();
		factorofnumber2(num1);
		snc.close();
	}

	static void factorofnumber2(int num) {
		if (num <= 0) {// if number is negative
			System.out.println("Factors of number  " + num + " are :");
			for (int i = num; i <= -(num); ++i) {
				if (i != 0) {
					if (num % i == 0) {
						System.out.print(i + ",");
					}
				}
			}
		} else {// when number is positive
			System.out.println("Factors of number " + num + " are :");
			for (int i = 1; i <= num; ++i) {
				if (num % i == 0) {
					System.out.print(i + ",");
				}
			}

		}
	}
}
