package org.javaprograms.methods;

public class Sample {
	
//	//instance variables
//	private double num1, num2;
//	
//	//parameterized constructor
//	Sample(double x, double y)
//	{
//		num1 = x;
//		num2 = y;
//	}
	
	//method to calculate sum of num1, num2
	//this method does not accept any values
	//does not return result
	
	
	//static method should be declared as static
	static double sum(double num1, double num2)
	{
		double res = num1+num2;
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//create the object to sample calls
//		Sample s = new Sample();
		
		//call the method and pass the two values to the method.Store the returned result in x 
		double x = Sample.sum(10, 32.5);
		System.out.println("Sum "+x);
	}

}
