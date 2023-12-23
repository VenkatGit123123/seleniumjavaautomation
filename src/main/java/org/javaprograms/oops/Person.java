package org.javaprograms.oops;

public class Person {
	
	//properties -variables
	String name = "Venkat";
	int age = 30;
	
	//actions - methods
	void talk()
	{
		System.out.println("Hello i am "+ name);
		System.out.println("My age is "+ age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create person class object: Raju
		Person Raju = new Person();
		
		//initialize the instance variables using the reference
		Raju.name = "Raju";
		Raju.age = 22;
		
		//call the talk method
		Raju.talk();
		
		//find the hashcode of the object
		System.out.println("Hash code = "+Raju.hashCode());
		
		

	}
	
	}


