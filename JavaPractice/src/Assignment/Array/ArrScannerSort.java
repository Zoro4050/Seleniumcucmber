package Assignment.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrScannerSort {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter lenght of array: ");
		int size = scn.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter elements of array: ");

		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		SortArr(arr);
		scn.close();
	}

	public static void SortArr(int a[]) {

		Arrays.sort(a);

		System.out.println("Print sorted Array:");
		for (int num : a) {
			System.out.println(num);
		}
	}
}
