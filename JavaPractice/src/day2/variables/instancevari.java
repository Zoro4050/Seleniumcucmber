package day2.variables;

public class instancevari {
    
	//global static variables;
	 static int num1=20,num2=4;
	 
	//global instance variables;
	 int num3=30,num4;
	
	public static void main(String[] args) {
		
		double res=num1+num2,res2;
		 
		//creating instance of class instancevari
		//instancevari ref=new instancevari(); OR
		instancevari ref;                            // Declaration of instance
		ref = new instancevari();				     // object initialization
		ref.num4=40;
		res2=ref.num3+ref.num4;
		System.out.println("Sum of static num = " +res);
		System.out.println("Sum of intance num = " +res2);
	}

}
