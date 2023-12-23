package org.javaprogramms.IO;
import java.io.*;

public class AcceptingStringfromKeyboard {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//create a bufferedreader object to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//ask for string and read it
		System.out.println("Enter a name: ");
		String name = br.readLine();
		
		//display the string
		System.out.println("You entered: "+name);

	}

}
