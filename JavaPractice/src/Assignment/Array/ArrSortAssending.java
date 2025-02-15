package Assignment.Array;

import java.util.Arrays;

public class ArrSortAssending {

	public static void ArrSortAsscending(int a[]) {			

		Arrays.sort(a);
	}

	public static void main(String[] args) {
		int num[] = { 12, 33, 4, 66, 75, 74, 24, 22 };
//		Arrays.sort(num);
		ArrSortAsscending(num);
		for (int number : num) {
			System.out.print(number);
		}
	}

}