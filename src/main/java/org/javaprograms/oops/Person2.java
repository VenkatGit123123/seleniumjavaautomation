package org.javaprograms.oops;

 class Person2 {
	
	
	//instance variables are initialized here
	private String name = "Raju";
	private int age = 30;
	
	//default constructor
	Person2()
	{
		name = "Raju";
		age = 22;
	}
	
	
	
	
	//methods
	void talk()
	{
		System.out.println("Hello i am "+ name);
		System.out.println("My age is "+ age);
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create person class object: Raju
		Person2 Raju = new Person2();
		
		//call the talk() method
		Raju.talk();
		
		//create another person class object : Sita
		Person2 Sita = new Person2(); 
		
		//call the talk() method
		Sita.talk();

	}

}
