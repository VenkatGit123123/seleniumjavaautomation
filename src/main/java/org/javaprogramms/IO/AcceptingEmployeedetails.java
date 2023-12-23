package org.javaprogramms.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptingEmployeedetails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//create a bufferedreader object to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//accept employee details
		System.out.println("Enter id: ");
		int id = Integer.parseInt(br.readLine());
		
		System.out.println("Enter sex (M/F): ");
		char sex = (char)br.readLine().charAt(0);
		
		System.out.println("Enter name: ");
		String name = br.readLine();
		
		//display the employee details
		System.out.println("Id= "+ id);
		System.out.println("Sex= "+ sex);
		System.out.println("Name= "+ name);
				

	}

}
