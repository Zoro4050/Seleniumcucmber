package Assignment.Array;

public class ArrPrintRevers {
	public static void Printrevers(int a[]) {
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 3 };
		Printrevers(num);
	}

}
