package day2.variables;

public class example1 {

		//Global static variable
		static int a;
		static byte b;
		static long c;
		static short d;
		static float e;
		static double f;
		static char   g;
		static boolean h;
	public static void main(String[] args) {
		System.out.println("Program Starts\n");
		//local variables;
		byte var1=1;
		int var2=5;
		short var3=6;
		long var4=7;
		double var5=345.998;
		float  var6=384.58f;
		char var7='A';
		boolean var8=true;
		System.out.println("Datatype byte = " +var1);
		System.out.println("Datatype int = " +var2);
		System.out.println("Datatype short = " +var3);
		System.out.println("Datatype long = " +var4);
		System.out.println("Datatype double = " +var5);
		System.out.println("Datatype float=\t" +var6);
		System.out.println("Datatype char=\t" +var7);
		System.out.println("Datatype boolean=\t" +var8);
		
		System.out.println("\n*********GlobalVariable*********");
		//printing default values of global variables
		System.out.println("Default value of int = " +a);
		System.out.println("Default value of byte = " +b);
		System.out.println("Default value of long = " +c);
		System.out.println("Default value of short = " +d);
		System.out.println("Default value of float  = " +e);
		System.out.println("Default value of double = " +f);
		System.out.println("Default value of char = " +g);
		System.out.println("Default value of boolean = " +h);
		System.out.println("\nProgram Ends");
		


	}

}
