package org.javaprogramms.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptingIntegerfromKeyboard {

	public static void main(String[] args) throws IOException, NumberFormatException  {
		// TODO Auto-generated method stub
		
		//create a bufferedreader object to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//ask for integer and read it
		System.out.println("Enter an integer value: ");
		int num = Integer.parseInt(br.readLine());
		
		//display the int
		System.out.println("You entered: "+num);
		
		
				

	}

}
