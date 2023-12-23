package org.javaprogramms.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptingFloatfromKeyboard {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		//create a bufferedreader object to accept data from keyboard
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				//ask for float and read it
				System.out.println("Enter an float value: ");
				float n = Float.parseFloat(br.readLine());
				
				//display the float
				System.out.println("You entered: "+n);
				

	}

}
