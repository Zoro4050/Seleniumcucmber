package Array;

public class frequrncyOfEachElement {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 1, 2, 1, 4, 3, 5, 5 };

		boolean[] visited = new boolean[array.length];

		for (int i = 0; i < array.length; i++) {
			// skip the counted element
			if (visited[i]) {
				continue;

			}
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					visited[j] = true;
				}
			}
			System.out.println("Element" + array[i] + " count" + count);

		}
	}

}
