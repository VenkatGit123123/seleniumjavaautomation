package org.javaprograms.oops;

public class Person3 {
	
	//instance variables
	private String name;
	private int age;
	
	//default constructor
	Person3()
	{
		name = "Raju";
		age = 22;
	}
	
	//parameterized constructor
	Person3(String s, int i)
	{
		name = s;
		age = i;
	}
	
	//method
	void talk()
	{
		System.out.println("Hello i am "+ name);
		System.out.println("My age is "+ age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create Raju object. here default constructor is call
		Person3 Raju = new Person3();
		
		//call the talk() method
		Raju.talk();
		
		//create Sita object. Here parameterized constructor is called
		Person3 Sita = new Person3("Sita", 20);
		
		//call the talk method
		Sita.talk();
		

	}

}
