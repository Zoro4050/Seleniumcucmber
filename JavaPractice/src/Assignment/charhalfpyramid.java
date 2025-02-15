package Assignment;

public class charhalfpyramid {

	public static void main(String[] args) {
		char alpha = 'A';
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(alpha + " ");
			}
			++alpha;
			System.out.println("");

		}
		System.out.println("************************");
		alpha = 'E';
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(alpha + " ");
			}
			--alpha;
			System.out.println();
		}
	}

}
