package Assignment.Array;

public class ArrElementFrq {
	public static void EeleFrq(int A[]) {
		boolean mark[] = new boolean[A.length];

		for (int i = 0; i < A.length; i++) {

			if (mark[i] == true) {
				// element is already counted
			}

			else {
				// count
				int count = 1;
				for (int j = i + 1; j < A.length; j++) {
					if (A[i] == A[j]) {
						count++;
						mark[j] = true;
					}
				}
				System.out.println("Element " + A[i] + " count : " + count);
			}
		}
	}

	public static void main(String[] args) {
		int[] num = { 1, 3, 3, 3, 4, 4, 5, 7, 7, 7, 7 };
		// calling method to count the frequency of elements

		EeleFrq(num);
	}

}
