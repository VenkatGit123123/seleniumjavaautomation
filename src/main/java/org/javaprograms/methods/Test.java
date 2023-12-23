package org.javaprograms.methods;

public class Test {
	
	//static variables
	 static int x = 10;
	 
	 //display the variable
	static  void display()
	 {
		 System.out.println(x);
	 }
	
//	//parameterized constructor
//	Test(int X)
//	{
//		this.X = X;
//	}
	
//	//static method accessing x value
//	static void access()
//	{
//		System.out.println("X = "+ x);
//	}

	public static void main(String[] args) {
		
		//create two references
		Test obj1, obj2;
		
		//create two objects
		obj1 = new Test();
		obj2 = new Test();
		
		//increment x in obj1
		++obj1.x;
		System.out.print("x in obj1: ");
		obj1.display();
		
		//display x in obj2
		System.out.print("x in obj2: ");
		obj2.display();
		
		//Test.access();

	}

}
