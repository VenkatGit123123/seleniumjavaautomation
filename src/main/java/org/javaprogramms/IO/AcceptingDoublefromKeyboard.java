package org.javaprogramms.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptingDoublefromKeyboard {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		//create a bufferedreader object to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//ask for double and read it
		System.out.println("Enter an double value: ");
		double n = Double.parseDouble(br.readLine());
		
		//display the double
		System.out.println("You entered: "+n);
		

	}

}
