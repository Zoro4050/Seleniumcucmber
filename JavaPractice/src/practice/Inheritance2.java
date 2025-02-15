package practice;

abstract class animal {

	String name;
	int age;

	animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void eat() {
		System.out.println(name + " is eating.");
	}

	void sleep() {
		System.out.println(name + " is sleeping.");
	}

	abstract void makesound();

}

class dog extends animal {

	dog(String name, int age) {
		super(name, age);
	}

	void bark() {
		System.out.println(name + " is barking.");
	}

	@Override
	void makesound() {
		System.out.println(name + "says: BARK!!");
	}
}

class cat extends animal {

	cat(String name, int age) {
		super(name, age);
	}

	void meow() {
		System.out.println(name + " is meowing.");
	}

	@Override
	void makesound() {
		System.out.println(name + "says: MEOW!!");
	}
}

public class Inheritance2 {
	public static void main(String[] args) {

		// dog
		dog jerry = new dog("Jerry", 3);

		jerry.eat();
		jerry.sleep();
		jerry.bark();
		jerry.makesound();

		// cat
		cat tom = new cat("Tom", 2);

		tom.sleep();
		tom.eat();
		tom.meow();
		tom.makesound();
	}
}
