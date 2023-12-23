package org.javaprograms.arrays;

public class CommandLineArgsAddTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//check if 2 args are not entered come out
		if(args.length != 2)
		{
			System.out.println("please enter values");
			return;
		}
		
		//take the numbere from args
		//they would be in string form
		String s1 = args[0];
		String s2 = args[1];
		
		//convert them into numerics
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		//add them and display
		double d3 = d1+d2;
		System.out.println("The sum= "+d3);
		

	}

}
