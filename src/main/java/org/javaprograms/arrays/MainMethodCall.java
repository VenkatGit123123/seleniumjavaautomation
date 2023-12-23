package org.javaprograms.arrays;

public class MainMethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling main() of a class1 from another class: Class2
		//args contains names, display them
		for(String s:args) // we are using for each loop here
		System.out.println(s);
			
		
	}

}

class Class2{
	
	public static void main(String args[])
	{
		//take a string type array
		String names[] = {"Venkat", "Suresh", "Vinay", "Neha"};
		
		//call main() of Class and pass the names array
		MainMethodCall.main(names);
	}
}
