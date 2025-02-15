package Assignment.Array;

import java.util.Scanner;

public class ArrScannerReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Ask the user for the size of the array
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		// Initialize the array
		int[] array = new int[size];

		// Read array elements from the user
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		// Reverse the array
		reverseArray(array);

		// Print the reversed array
		System.out.println("Reversed array:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	public static void reverseArray(int[] array) {
		int n = array.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = temp;
		}
	}
}
