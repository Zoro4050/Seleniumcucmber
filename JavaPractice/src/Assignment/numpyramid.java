package Assignment;

public class numpyramid {

	public static void main(String[] args) {
		int rows2 = 4;
		int num2 = 1;
		for (int i = 1; i <= rows2; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num2 + " ");
				num2++;
			}
			System.out.println();
		}
	}

}
