package org.javaprograms.oops;

import java.io.*;
public class Person4 {
	
	//instance variables
	private String name;
	private int age;
	
	//parameterized constructor
	Person4(String s, int i)
	{
		name = s;
		age = i;
	}
	

//	//to accept the name and age
//    public void accept() throws IOException
//    {
//    	//to accept data from keyboard
//    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    	//to accept name and age
//        System.out.println("Enter name: ");
//        name = br.readLine();
//        System.out.println("Enter age: ");
//        age = Integer.parseInt(br.readLine());
//    			
  //  }
    
    //to check the age and display he is young, middle aged or old
    public void check()
    {
    	if(age<=30)
    		System.out.println(name+" is young");
    	else if(age<=50){
    		System.out.println(name+" is middle aged");
    	}
    		else {
    			
    			System.out.println(name+" is old");
    			
    		}
    	
    }

	

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//create bufferedreader object
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//accept person name and age from command line arguments
		//name and age are stored in args[0] and args[1] as string
		String s = args[0];
		int i = Integer.parseInt(args[1]);
		
		
		
		//create person class object
		Person4 p = new Person4(s,i);
		
		
		//check age
		p.check();

	}

}
