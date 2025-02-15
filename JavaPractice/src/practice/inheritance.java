package practice;

class fruit {
	fruit() {
		System.out.println("Fruit class constructor");
	}

	void tast() {
		System.out.println("fruit class method");
	}

}

class apple extends fruit {
	apple() {
		System.out.println("apple class constructor");
	}

	void shape() {
		System.out.println("Apple is round");
	}
}

public class inheritance {
	public static void main(String[] args) {

		apple fru = new apple();
		fru.tast();
		fru.shape();

	}

}
