package org.javaprogramms.IO;

import java.io.*;

public class AcceptingCharfromKeyboard {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//create a bufferedReader object to accept the data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//ask for char and read it
		System.out.println("Enter character: ");
		char ch = (char)br.read();
		
		//display the character
		System.out.println("You entered: "+ ch);
		

	}

}
