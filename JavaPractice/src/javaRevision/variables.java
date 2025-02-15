package javaRevision;

public class variables {
	// global variables

	// Static or class variables
	static int num = 34;
	static char x = 'h';
	static short sh = 232;

	// instance or non static variables
	int a = 13;
	boolean b = false;
	char name = 's';
	double z = 243455345;
	float y = 454346334;
	byte u = 54;
	long k = 243552345;

	public static void main(String[] args) {
		// calling static variables
		System.out.println(num);
		System.out.println(variables.x + sh);

		// calling instance variables
		variables obj = new variables();

		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.name);
		System.out.println(obj.z);
		System.out.println(obj.y);
		System.out.println(obj.k);

	}
}
