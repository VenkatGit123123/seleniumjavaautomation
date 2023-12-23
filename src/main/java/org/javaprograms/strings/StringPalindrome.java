package org.javaprograms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPalindrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//accept the string from keyboard
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a string: ");
		String str = br.readLine();
		
		//store a copy of original string in temp
		String temp = str;
		
		//convert the string into stringBuffer
		StringBuffer sb = new StringBuffer(str);
		
		//now reverse the string in stringBuffer
		sb.reverse();
		
		//convert the stringBuffer into a string
		str = sb.toString();
		
		//compare the original string available in temp with this reversedstring
		if(temp.equalsIgnoreCase(str))
			
			System.out.println(temp+" is palindrome ");
		else
			
			System.out.println(temp+" is not palindrome ");
		
				

	}

}
