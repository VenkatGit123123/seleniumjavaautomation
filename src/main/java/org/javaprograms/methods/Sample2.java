package org.javaprograms.methods;

public class Sample2 {
	
	//this referes to all the members of present class
	
	//x is a instance variable
	private int x;
	
	//default constructor
	Sample2()
	{
		this(55);  //call the present class param constructor and send 55
		this.access(); //call present class method
	}
	
	//parameterized constructor
	Sample2(int x)
	{
		this.x = x; //refere present class instance variable
	}
	
	//method
	void access()
	{
		System.out.println("x= "+x);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 s = new Sample2();

	}

}
