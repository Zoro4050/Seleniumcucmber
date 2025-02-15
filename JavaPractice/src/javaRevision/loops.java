package javaRevision;

public class loops {

	public static void main(String[] args) {

		// for loop when number of iterations are known
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// for each loop used for iterating collections
		int i = 0;
		System.out.println("************");
		int[] num = { 1, 2, 3, 4, 6 };
		for (int numbers : num) {
			System.out.println(numbers);
		}
		System.out.println("************");

		// number of iterations are not known,iterates on condition
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		// number of iterations are not known but still loop will execute at least once
		// and then check the condition
		System.out.println("************");
		i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 5);
	}

}
