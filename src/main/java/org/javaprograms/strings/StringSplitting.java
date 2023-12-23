package org.javaprograms.strings;

public class StringSplitting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take a string str which is to be broken
		String str = "Hello this is a book on java";
		
		//declare a string type array s to store pieces
		String s[];
		
		//split the string where a space is found in str
		s = str.split(" ");
		
		//display the pieces from s
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}

	}

}
