package Assignment.Array;

import java.util.Arrays;

public class ArrCopy {

	public static int[] Copyarray(int A[]) {

		return Arrays.copyOf(A, A.length);
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4,3, 6, 3 };
		System.out.println("Orignal array is ");
		for (int num2 : numbers) {
			System.out.print(num2);
		}
		// calling method Arrcopy
		int[] copynum = Copyarray(numbers);
		// copied array
		System.out.println("\n"+"Copied array is ");
		for (int num : copynum) {
			System.out.print(num);
		}
	}

}
