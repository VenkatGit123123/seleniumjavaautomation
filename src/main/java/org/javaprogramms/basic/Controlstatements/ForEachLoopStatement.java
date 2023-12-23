package org.javaprogramms.basic.Controlstatements;

public class ForEachLoopStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using For each loop - to display array elements
		
		//declare an array with 5 elements
		int arr[] = {200, 300, -400, 55, 60 };
		
		//use for each loop to retrive elements from array
		for(int i : arr)
		{
			System.out.println(i);  //i represents each element of array
		}

	}

}
