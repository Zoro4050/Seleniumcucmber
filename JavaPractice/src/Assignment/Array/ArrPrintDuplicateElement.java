package Assignment.Array;

/**
 * 
 * @author Saurabh
 *
 */
public class ArrPrintDuplicateElement {

	public static void DupElement(int a[]) {
		for (int i = 0; i < a.length; i++) {

			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count = count + 1;
				}
				if (count > 1) {
					System.out.println(a[i]);
					break;
				}
			}

		}
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 4, 3, 1, 2, 5, 1, 3, 6, 4 };
		DupElement(num);
	}

}
