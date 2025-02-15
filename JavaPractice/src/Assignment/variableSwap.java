package Assignment;

public class variableSwap {

	public static void main(String[] args) {
	//Swap variables using temporary variables
		
	int a=10,b=39;
	System.out.println("**********Before Swaping***********");
	System.out.println("x ="+a+" y ="+b);
	
	int temp=a;
	a=b;
	b=temp;
	System.out.println("***********After Swping************");
	System.out.println("x ="+a+" y="+b);
	
	}

}
