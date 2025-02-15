package practice;

public class constructorChaining {

	public static void main(String[] args) {
		person p = new person();

		person p1 = new person("Saurabh", 34);

		p.display();
		p1.display();

	}
}

class person {
	String name;
	int age;

	person() {
		this("unkown", 00);
	}

	person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("Name = " + this.name + " , age =" + this.age);
	}
}
