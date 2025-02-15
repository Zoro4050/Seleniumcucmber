package javaRevision;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number 1");
		int num1 = scan.nextInt();

		System.out.println("Enter number 2");
		int num2 = scan.nextInt();

		// Arithmetic operators
		System.out.println("Addition of 2 numbers " + (num1 + num2));
		System.out.println("Substraction of 2 numbers " + (num1 - num2));
		System.out.println("multiplication of 2 numbers " + (num1 * num2));
		System.out.println("division of 2 numbers " + (num1 / num2));
		System.out.println("Modulus of 2 numbers " + (num1 % num2));

		// Relational Operators
		System.out.println("Equal" + (num1 == num2));
		System.out.println("Not Equal" + (num1 != num2));
		System.out.println("Grater than" + (num1 > num2));
		System.out.println("Less than" + (num1 < num2));
		System.out.println("Graterthan Equal" + (num1 >= num2));
		System.out.println("Lessthan Equal" + (num1 <= num2));

		// Logical operators
		boolean cond1 = (num1 > 0);
		boolean cond2 = (num2 > 0);
		System.out.println("AND && " + (cond1 && cond2));
		System.out.println("OR || " + (cond1 || cond2));
		System.out.println("NOT ! " + (!cond2));

		// unary operators
		System.out.println("Pre Increment" + (++num1));
		System.out.println("Post Increment" + (num1++));
		System.out.println(num1);

		System.out.println("Pre Decrement" + (--num1));
		System.out.println("Post Decrement" + (num1--));

		System.out.println(num1);
		scan.close();

	}

}
